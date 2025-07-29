public class Main{
	public static void main(String args[]){
		Solution s = new Solution();

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		
		ListNode head2 = new ListNode(4);
		head2.next = new ListNode(5);
		head2.next.next = new ListNode(6);
		ListNode res = s.addTwoNumbers(head, head2);
		printL(res);
	}
	public static void printL(ListNode head){
		ListNode ptr = head;
		while(ptr != null){
			System.out.println(ptr.val);
			ptr = ptr.next;
		}
	}
}
