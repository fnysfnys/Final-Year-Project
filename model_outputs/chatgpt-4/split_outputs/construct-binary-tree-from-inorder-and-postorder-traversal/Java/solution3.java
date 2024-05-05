import java.util.Stack;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) return null;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        stack.push(root);
        int inorderIndex = inorder.length - 1;

        for (int i = postorder.length - 2; i >= 0; i--) {
            int postVal = postorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.right = new TreeNode(postVal);
                stack.push(node.right);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex--;
                }
                node.left = new TreeNode(postVal);
                stack.push(node.left);
            }
        }
        return root;
    }
}
