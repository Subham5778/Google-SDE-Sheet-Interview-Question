class Solution {
    public int height(Node root) {
        if (root == null) {
            return -1; // so height in edges works
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
