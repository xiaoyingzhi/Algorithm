package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 20:11
 **/
public class 面试题25_合并两个排序的链表 {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node sortNode(Node node1,Node node2){
        if (node1==null){
            return node2;
        }else if (node2==null){
            return node1;
        }
        if (node1.val>node2.val){
            node2.next=sortNode(node1,node2.next);
            return node2;
        }else {
            node1.next=sortNode(node2,node1.next);
            return node1;
        }

    }
}
