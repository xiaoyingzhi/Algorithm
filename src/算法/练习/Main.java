package 算法.练习;



import java.util.*;

/**
 * @author wh
 * @create 2018-10-10 21:28
 **/
public class Main {
    public static class  NodeStr{
        String name;
        int avg;
        public NodeStr(String name,int avg){
            this.name=name;
            this.avg=avg;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<NodeStr> list = new LinkedList<>();
        boolean b = in.hasNextLine();
        while (b) {
            String str = in.nextLine();
            String[] split = str.split(" ");
            int sum = 0;
            for (int i= 1;i<split.length;i++){
                sum +=Integer.valueOf(split[i]);
            }
            list.add(new NodeStr(split[0],sum/(split.length-1)));
            b=in.hasNextLine();
        }
        Comparator<NodeStr> com=new Comparator<NodeStr>(){
            @Override
            public int compare(NodeStr o1, NodeStr o2) {
                return o1.avg-o2.avg;
            }
        };
        Collections.sort(list,com);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).name+" "+list.get(i).avg);
        }
    }
}
