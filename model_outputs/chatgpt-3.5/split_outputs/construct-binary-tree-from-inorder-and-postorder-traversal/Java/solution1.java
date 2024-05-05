class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0)
            return null;
        
        int rootValue = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexInInorder = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndexInInorder = i;
                break;
            }
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndexInInorder);
        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, rootIndexInInorder);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndexInInorder + 1, inorder.length);
        int[] rightPostorder = Arrays.copyOfRange(postorder, rootIndexInInorder, postorder.length - 1);

        root.left = buildTree(leftInorder, leftPostorder);
        root.right = buildTree(rightInorder, rightPostorder);
        
        return root;
    }
}
