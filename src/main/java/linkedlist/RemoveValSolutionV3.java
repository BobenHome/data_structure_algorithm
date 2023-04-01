package linkedlist;

/**
 * @author Leslie Tung created on 2023-02-16 23:44
 */
public class RemoveValSolutionV3 {

  public ListNode removeElements(ListNode head, int val) {

    if (head == null) {
      return null;
    }
    ListNode res = removeElements(head.next, val);

    if (head.val == val) {
      return res;
    } else {
      head.next = res;
      return head;
    }
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 5, 6, 6, 1, 78};
    ListNode listNode = new ListNode(arr);
    System.out.println(listNode);
    new RemoveValSolutionV3().removeElements(listNode, 6);
    System.out.println(listNode);
  }
}
