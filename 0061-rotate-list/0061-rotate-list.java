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
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null||head.next==null||k==0)
       return head;
      int count=0;
      ListNode temp=head;
      while(temp.next!=null)
      {
          temp=temp.next;
          count++;
      }
      count++;
      if(k%count==0)
          return head;
      ListNode temp2=head; 
      ListNode temp3=temp2;
      k=k%count;
      for(int i=0;i<count-k;i++)
      {
          temp3=temp2;
          temp2=temp2.next;
      }
      temp.next=head;
      temp3.next=null;
      return temp2;

    }
    // public ListNode rotateonce(ListNode head)
    // {
    //     ListNode temp=head,temp2=null;
    //     while(temp.next!=null)
    //     {
    //         temp2=temp;
    //         temp=temp.next;

    //     }
    //     temp.next=head;
    //     temp2.next=null;
    //     return temp;

    // }

}
// 1-->2-->3--->4-->5