package linkedlist;

/**
 * @author Leslie Tung created on 2023-02-16 23:44 添加递归调用的打印语句
 */
public class RemoveValSolutionV5 {

    public ListNode removeElements(ListNode head, int val, int depth) {

        String depthString = generateDepthString(depth);
        System.out.print(depthString);
        System.out.println("Call: remove " + val + " in " + head);

        if (head == null) {
            System.out.print(depthString);
            System.out.println("Return: " + null);
            return null;
        }
        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print(depthString);
        System.out.println("After remove " + val + ": " + res);

        ListNode ret;
        if (head.val == val) {
            ret = res;
        } else {
            head.next = res;
            ret = head;
        }
        System.out.print(depthString);
        System.out.println("Return: " + ret);
        return ret;
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 6, 1, 78};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        new RemoveValSolutionV5().removeElements(listNode, 6, 1);
        System.out.println(listNode);
    }
}
