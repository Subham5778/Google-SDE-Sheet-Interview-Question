// Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

// Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop.

// Examples:

// Input: head: 1 → 2 → 3 → 4 → 5, c = 2
// Output: 4
// Explanation: There exists a loop in the linked list and the length of the loop is 4.

// Input: head: 25 → 14 → 19 → 33 → 10 → 21 → 39 → 90 → 58 → 45, c = 4
// Output: 7
// Explanation: The loop is from 33 to 45. So length of loop is 33 → 10 → 21 → 39 → 90 → 58 → 45 = 7.

// Input: head: 0 → 1 → 2 → 3, c = 0
// Output: 0
// Explanation: There is no loop.

// Constraints:
// 1 ≤ list size ≤ 105
// 0 ≤ node->data ≤ 104
// 0 ≤ c < list size

// Expected Complexities
// Time Complexity: O(n)
// Auxiliary Space: O(1)


/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here.
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return countCycleLength(slow);
            }
        }
        return 0;
    }
    public int countCycleLength(Node meetingpoint){
        Node curr = meetingpoint;
        int count =1;
        while(curr.next!=meetingpoint){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
