/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int len1=0,len2=0;
        ListNode temp1=head1;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        
        ListNode temp2=head2;
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        
        int diff=Math.abs(len1-len2);
        if(diff>0){
            if(len1>len2){
                while(diff>0){
                    head1=head1.next;
                    diff--;
                }
            }
                
                else if(len2>len1){
                    while(diff>0){
                        head2=head2.next;
                        diff--;
                    }
                }
            
        }
        
        while(head1!=null && head2!=null && head1!=head2){
            head1=head1.next;
            head2=head2.next;
        }
        
        return head1;
    }
}
