class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       if (inorder.length == 0) {
           return null;
       }
       TreeNode root = new TreeNode(postorder[postorder.length - 1]);
       Stack<TreeNode> stack = new Stack<>();
       stack.push(root);
       for (int i = 0; i < postorder.length - 1; i++) {
           TreeNode node = new TreeNode(postorder[i]);
           if (node.val < stack.peek().val) {
               stack.peek().left = node;
           } else {
               stack.peek().right = node;
           }
           stack.push(node);
       }
       return root;
    }
    
}
