package linkedlist;

/**
 * @author Leslie Tung created on 2023-02-16 23:44
 */
public class RemoveValSolutionV2 {

  public ListNode removeElements(ListNode head, int val) {
    // 给链表添加一个虚拟头节点
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    // 删除节点中间的元素
    ListNode prev = dummyHead;
    while (prev.next != null) {
      if (prev.next.val == val) {
        ListNode delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
      } else {
        prev = prev.next;
      }
    }
    return dummyHead.next;
  }
}
