class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = inStart;
        while (inorder[rootIndex] != rootValue) {
            rootIndex++;
        }

        int leftSubtreeSize = rootIndex - inStart;
        root.left = buildTreeHelper(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSubtreeSize - 1);
        root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd, postorder, postStart + leftSubtreeSize, postEnd - 1);

        return root;
    }
}
