package linkedlist;

/**
 * @author Leslie Tung created on 2023-02-16 23:43
 */
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int[] arr) {

    if (null == arr || arr.length == 0) {
      throw new IllegalArgumentException("error param!");
    }

    this.val = arr[0];
    ListNode cur = this;
    for (int i = 1; i < arr.length; i++) {
      cur.next = new ListNode(arr[i]);
      cur = cur.next;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    ListNode cur = this;
    while (null != cur) {
      sb.append(cur.val + "->");
      cur = cur.next;
    }
    sb.append("NULL");
    return sb.toString();
  }
}
