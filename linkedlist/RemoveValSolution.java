package linkedlist;

/**
 * @author Leslie Tung created on 2023-02-16 23:44
 */
public class RemoveValSolution {

  public ListNode removeElements(ListNode head, int val) {

    // 如果头节点是要待删除的元素需要循环判断删除掉
    while (head != null && head.val == val) {
      ListNode delNode = head;
      head = head.next;// 这一步是指head这个指针向下移动了一位
      delNode.next = null;
    }

    if (head == null) {
      return null;
    }

    // 删除节点中间的元素
    ListNode prev = head;
    while (prev.next != null) {
      if (prev.next.val == val) {
        ListNode delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
      } else {
        prev = prev.next;
      }
    }
    return head;
  }
}
