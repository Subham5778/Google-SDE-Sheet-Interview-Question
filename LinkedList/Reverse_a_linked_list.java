// Given the head of a linked list, the task is to reverse this list and return the reversed head.

// Examples:

// Input: head: 1 -> 2 -> 3 -> 4 -> NULL
// Output: 4 3 2 1
// Explanation:

// Input: head: 2 -> 7 -> 10 -> 9 -> 8 -> NULL
// Output: 8 9 10 7 2
// Explanation:

// Input: head: 2 -> NULL
// Output: 2
// Explanation:

// Constraints:
// 1 ≤ list.size, node->data ≤ 105

// Expected Complexities
// Time Complexity: O(n)
// Auxiliary Space: O(1)






// Recursive method

/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/


class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null||head.next==null) return head;
        
        // recursive 
        Node rest = reverseList(head.next);
        head.next.next=head;
        head.next = null;
        return rest;
    }
}

// 3 pointer approach

/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
       Node prev =null,curr=head;
       while(curr!=null){
           Node next = curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       return prev;
    }
}
