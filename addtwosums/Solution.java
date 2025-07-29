/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //cases L1 is null and L2 is not
    //      L1 is not and  L2 is null
    //      l1 is not and l2 is not
    //      l1 is null and l2 is null
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = null;
       ListNode ptr = null;
       int remainder = 0;
       while(!(l1 == null && l2 == null)){
            if(head == null){
                if(l1 == null){
                    head = new ListNode((l2.val+remainder)%10);
                    remainder = (l2.val+remainder)/10;
                    ptr = head;
                    l2 = l2.next;
                }else if(l2 == null){
                    head = new ListNode((l1.val+remainder)%10);
                    remainder = (l1.val+remainder)/10;
                    l1 = l1.next;
                    ptr = head;
                }else{
                    head = new ListNode((l1.val+l2.val)%10);
                    remainder = (l1.val+l2.val)/10;
                    ptr = head;
                    l1 = l1.next;
                    l2 = l2.next;
                }
            }else{
                if(l1 == null){
                    ptr.next = new ListNode((l2.val+remainder)%10);
                    remainder =  (l2.val+remainder)/10;
                    ptr = ptr.next;
                    l2 = l2.next;
                }else if(l2 == null){
                    ptr.next = new ListNode((l1.val+remainder)%10);
                    remainder = (l1.val+remainder)/10;
                    l1 = l1.next;
                    ptr = ptr.next;
                }else{//neither r null
                    ptr.next = new ListNode((l1.val+l2.val+remainder)%10);
                    remainder = (l1.val+l2.val+remainder)/10;
                    l1 = l1.next;
                    l2 = l2.next;
                    ptr = ptr.next;
                }
            }
       }
       if(remainder > 0){
        ptr.next = new ListNode(remainder);
       }
       return head;
    }
}
