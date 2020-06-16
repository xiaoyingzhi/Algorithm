package 算法.牛客;

import java.util.HashMap;

/**
 * @author wh
 * @create 2018-10-14 20:16
 **/
public class 面试题35_复杂链表的复制 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode cloneList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode temp = head;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while (temp != null) {
            map.put(temp, new RandomListNode(temp.label));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
