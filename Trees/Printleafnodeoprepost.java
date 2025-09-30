class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        Stack<Integer>     st     = new Stack<>();     // Stack to simulate the path of nodes in BST
        ArrayList<Integer> result = new ArrayList<>(); // To store the final leaf nodes

        for (int i = 0; i < preorder.length; i++) {
            int count = 0;
            int curr  = preorder[i]; // Current node in preorder

            // Pop until we find a node greater than current, simulating right child path
            while (!st.isEmpty() && curr > st.peek()) {
                st.pop();
                count++;
            }

            // If two or more nodes are popped, then the previous node is a leaf
            if (count >= 2) {
                result.add(preorder[i - 1]);
            }

            // Push current node to stack
            st.push(curr);
        }

        // Last node is always a leaf in preorder traversal
        result.add(preorder[preorder.length - 1]);

        return result;
    }
}
