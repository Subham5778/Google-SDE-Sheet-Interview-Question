// You are given a node del_node of a Singly Linked List where you have to delete this given node from the linked list but you are not given the head of the list.

// After deleting the given node:

// The number of nodes in the linked list should decrease by one.
// All the values before & after the del_node node should be in the same order.
// Note: It is guaranteed that there exists a node with a value equal to the del_node value and it will not be the last node of the linked list.

// Examples:

// Input: Linked List = 1 -> 2, del_node = 1
// Output: 2
// Explanation: After deleting 1 from the linked list, we have remaining nodes as 2.
 
// Input: Linked List = 10 -> 20 -> 4 -> 30, del_node = 20
// Output: 10->4->30
// Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.

// Constraints:
// 2 ≤ number of nodes ≤ 106  
// 1 ≤ node->data ≤ 106

// Expected Complexities
// Time Complexity: O(1)
// Auxiliary Space: O(1)


/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        // code here
        if(del_node==null||del_node==null)return;
        
        // Copying the next node 
        del_node.data=del_node.next.data;
        
        // skip over the new data 
        del_node.next=del_node.next.next;
        
    }
    public static Node prinList(Node head){
        Node curr=head;
        while (head!=null){
            System.out.println(curr);
            curr = curr.next;
        }
        return curr;
    }
}
