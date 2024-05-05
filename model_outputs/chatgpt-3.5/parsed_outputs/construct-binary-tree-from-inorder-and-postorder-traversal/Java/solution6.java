class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int postIndex, int inStart, int inEnd) {
        if (inStart > inEnd || postIndex < 0) {
            return null;
        }

        int rootValue = postorder[postIndex];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexInInorder = inStart;
        while (inorder[rootIndexInInorder] != rootValue) {
            rootIndexInInorder++;
        }

        int rightSubtreeSize = inEnd - rootIndexInInorder;
        root.right = buildTreeHelper(inorder, postorder, postIndex - 1, rootIndexInInorder + 1, inEnd);
        root.left = buildTreeHelper(inorder, postorder, postIndex - rightSubtreeSize - 1, inStart, rootIndexInInorder - 1);

        return root;
    }
}