package 算法.字符串;

import java.util.HashMap;

/**
 * @author wh
 * @create 2018-09-25 10:45
 **/
public class 复制一个复杂链表 {
    HashMap<RandomListNode, RandomListNode> map1 = new HashMap<>();

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode head = pHead;
        while (head != null) {
            map1.put(head, new RandomListNode(head.label));
            head = head.next;
        }
        head = pHead;
        while (head != null) {
            map1.get(head).next = map1.get(head.next);
            map1.get(head).random = map1.get(head.random);
            head = head.next;
        }
        return map1.get(pHead);
    }

}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}