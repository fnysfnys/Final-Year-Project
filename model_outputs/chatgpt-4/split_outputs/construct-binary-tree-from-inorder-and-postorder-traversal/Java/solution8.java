import java.util.Stack;

class Solution {
    public TreeNode buildTree(int[] inorder

, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        stack.push(root);
        int inIndex = inorder.length - 1;

        for (int i = postorder.length - 2; i >= 0; i--) {
            TreeNode currentNode = stack.peek();
            if (currentNode.val != inorder[inIndex]) {
                currentNode.right = new TreeNode(postorder[i]);
                stack.push(currentNode.right);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inIndex]) {
                    currentNode = stack.pop();
                    inIndex--;
                }
                currentNode.left = new TreeNode(postorder[i]);
                stack.push(currentNode.left);
            }
        }

        return root;
    }
}
