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
        Map<ListNode,ListNode> cMap= new HashMap<>();
        int i=0;
        while(temp!=null){
            
            if(cMap.get(temp)!=null){
                return cMap.get(temp);
            }
            else{
                cMap.put(temp,temp);
            }
            temp=temp.next;
            ++i;

        }
        return null;
        
    }
}