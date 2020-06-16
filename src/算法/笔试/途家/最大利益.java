package 算法.笔试.途家;

import java.util.*;

/**
 * @author wh
 * @create 2018-10-16 19:28
 **/
public class 最大利益 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split("[\\[\\]]");
        String[] dStr = nums[1].split(",");
        String[] p = nums[3].split(",");
        String[] w = nums[5].split(",");
        int[] difficulty = new int[dStr.length];
        int[] profit = new int[p.length];
        int[] worker = new int[w.length];
        for (int i = 0; i < dStr.length; i++) {
            difficulty[i] = Integer.valueOf(dStr[i]);
        }
        for (int i = 0; i < p.length; i++) {
            profit[i] = Integer.valueOf(p[i]);
        }
        for (int i = 0; i < w.length; i++) {
            worker[i] = Integer.valueOf(w[i]);
        }
        System.out.println(maxProfitAssignment(difficulty, profit, worker));

    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<Pair> jobs = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++)
            jobs.add(new Pair(difficulty[i], profit[i]));
        Collections.sort(jobs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.difficulty - o2.difficulty;
            }
        });
        Arrays.sort(worker);
        int ans = 0;
        int best = 0;
        int i = 0;
        for (int level : worker) {
            while (i < difficulty.length && level >= jobs.get(i).difficulty)
                best = Math.max(best, jobs.get(i++).profit);
            ans += best;
        }
        return ans;
    }
}

class Pair {
    int difficulty;
    int profit;

    public Pair(int difficulty, int profit) {
        this.difficulty = difficulty;
        this.profit = profit;
    }
}

