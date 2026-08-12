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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        ListNode cur1 = list1;
        while(cur1 != null) {
            numbers.add(cur1.val);
            cur1 = cur1.next;
        }

        ListNode cur2 = list2;
        while(cur2 != null) {
            numbers.add(cur2.val);
            cur2 = cur2.next;
        }

        Collections.sort(numbers);
        
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        for(int number: numbers) {
            cur.next = new ListNode(number);
            cur = cur.next; 
        }

        return dummy.next;
    }
}