class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexInInorder = inStart;
        while (inorder[rootIndexInInorder] != rootValue) {
            rootIndexInInorder++;
        }

        int leftSubtreeSize = rootIndexInInorder - inStart;
        root.left = buildTreeHelper(inorder, postorder, inStart, rootIndexInInorder - 1, postStart, postStart + leftSubtreeSize - 1);
        root.right = buildTreeHelper(inorder, postorder, rootIndexInInorder + 1, inEnd, postStart + leftSubtreeSize, postEnd - 1);

        return root;
    }
}