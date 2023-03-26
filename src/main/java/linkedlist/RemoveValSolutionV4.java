package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leslie Tung created on 2023-02-16 23:44
 */
public class RemoveValSolutionV4 {

  public ListNode removeElements(ListNode head, int val, List<Integer> list) {

    if (head == null) {
      return null;
    }

    if (head.val != val) {
      list.add(head.val);
    }
    return removeElements(head.next, val, list);
  }

  public static void main(String[] args) {

    int[] arr = {2, 4, 5, 6, 6, 1, 78};
    ListNode listNode = new ListNode(arr);
    System.out.println(listNode);
    List<Integer> list = new ArrayList<>();
    new RemoveValSolutionV4().removeElements(listNode, 6, list);
    System.out.println(list);
  }
}
