class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       if (inorder.length == 0) {
           return null;
       }
       Map<Integer, Integer> inorderIndices = new HashMap<>();
       for (int i = 0; i < inorder.length; i++) {
           inorderIndices.put(inorder[i], i);
       }
       TreeNode root = new TreeNode(postorder[postorder.length - 1]);
       for (int i = 0; i < postorder.length - 1; i++) {
           TreeNode node = new TreeNode(postorder[i]);
           if (node.val < root.val) {
               root.left = node;
           } else {
               root.right = node;
           }
       }
       return root;
    }
    
}
