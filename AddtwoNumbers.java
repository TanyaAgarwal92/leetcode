/You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if ( l1 == null && l2 == null){
            return new ListNode(-1);
        }
        int carry = 0;
        ListNode res = null;
        ListNode prev = null;
        ListNode temp = null;
        while (l1 != null || l2 != null){
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            if ( sum > 9){
                carry = sum / 10;
            }
            else if ( sum <= 9){
                carry = 0;
            }
            sum = sum % 10;
            temp = new ListNode(sum);
            if ( res == null){
                res = temp;
            }
            else{
                prev.next = temp;
            }
            prev = temp;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;  
        }
        if (carry > 0){
            temp.next = new ListNode(carry);
        }
        return res;
        
    }
}
