/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        Set<ListNode> cMap= new HashSet<>();
        int i=0;
        while(temp!=null){
            
            if(cMap.contains(temp)){
                return temp;
            }
            else{
                cMap.add(temp);
            }
            temp=temp.next;
            ++i;

        }
        return null;
        
    }
}