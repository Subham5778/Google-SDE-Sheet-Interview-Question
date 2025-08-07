// You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.

// Examples

// Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
// Output: 8
// Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.

// Input: LinkedList: 10->5->100->5, k = 5
// Output: -1
// Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.

// Constraints:
// 1 ≤ number of nodes ≤ 106
// 1 ≤ node->data , x ≤ 106
// 1 ≤ k ≤ 106

// Expected Complexities
// Time Complexity: O(n)
// Auxiliary Space: O(1)




// <--------------------- Solution-------------------->





/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node slow = head;
        Node fast = head;
      for(int i =0;i<k;i++){
          if(fast ==null)return -1;
          fast = fast.next;
      }
      while(fast!=null){
          fast = fast.next;
          slow = slow.next;
      }
      return (slow!=null)? slow.data : -1;
    }
}


