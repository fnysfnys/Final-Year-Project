public class Solution {
    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     * 
     * A valid BST is defined as follows:
     * - The left subtree of a node contains only nodes with keys less than the node's key.
     * - The right subtree of a node contains only nodes with keys greater than the node's key.
     * - Both the left and right subtrees must also be binary search trees.
     * 
     * Example:
     * Input: root = [2,1,3]
     * Output: true
     */
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    
    private boolean validate(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;
        if ((low != null && node.val <= low) || (high != null && node.val >= high)) return false;
        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val =

 x; }
    }
}