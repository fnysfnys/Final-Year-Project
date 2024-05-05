class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;

        return constructTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode constructTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inRootIndex = i;
                break;
            }
        }

        int leftTreeSize = inRootIndex - inStart;
        
        root.left = constructTree(inorder, inStart, inRootIndex - 1, postorder, postStart, postStart + leftTreeSize - 1);
        root.right = constructTree(inorder, inRootIndex + 1, inEnd, postorder, postStart + leftTreeSize, postEnd - 1);

        return root;
    }
}