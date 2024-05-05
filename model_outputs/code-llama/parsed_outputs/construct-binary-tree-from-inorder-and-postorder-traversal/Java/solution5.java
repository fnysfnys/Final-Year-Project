class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       if (inorder.length == 0) {
           return null;
       }
       Stack<TreeNode> stack = new Stack<>();
       TreeNode root = new TreeNode(postorder[postorder.length - 1]);
       stack.push(root);
       for (int i = 0; i < postorder.length - 1; i++) {
           TreeNode node = new TreeNode(postorder[i]);
           if (node.val < root.val) {
               root.left = node;
           } else {
               root.right = node;
           }
           stack.push(node);
       }
       return root;
    }
    
}
