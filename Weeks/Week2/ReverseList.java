package Weeks.Week2;

public class ReverseList {
  
  // Function to reverse a linked list  
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next;
    while (current != null) {
      next = current.getNext();
      current.setNext(prev);
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }
}
