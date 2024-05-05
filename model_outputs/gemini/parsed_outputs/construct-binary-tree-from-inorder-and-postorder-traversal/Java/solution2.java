class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = null;
        TreeNode prev = null;
        for (int i = postorder.length - 1; i >= 0; i--) {
            TreeNode curr = new TreeNode(postorder[i]);
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                prev = stack.pop();
            }
            if (prev != null) {
                curr.left = prev;
            }
            if (!stack.isEmpty()) {
                stack.peek().right = curr;
            }
            stack.push(curr);
            prev = null;
        }
        return root;
    }
    
}
