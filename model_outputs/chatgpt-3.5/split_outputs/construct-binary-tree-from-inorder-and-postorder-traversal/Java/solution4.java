class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }

        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);
        int rootIndexInInorder = inStart;

        while (inorder[rootIndexInInorder] != rootValue) {
            rootIndexInInorder++;
        }

        int leftTreeSize = rootIndexInInorder - inStart;
        root.left = buildTree(inorder, inStart, rootIndexInInorder - 1, postorder, postStart, postStart + leftTreeSize - 1);
        root.right = buildTree(inorder, rootIndexInInorder + 1, inEnd, postorder, postStart + leftTreeSize, postEnd - 1);

        return root;
    }
}
