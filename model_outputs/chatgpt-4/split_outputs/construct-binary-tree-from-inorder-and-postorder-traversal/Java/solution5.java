class Solution {
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postIndex--]);
        int inIndex = findIndex(inorder, root.val, inStart, inEnd);

        root.right = buildTreeHelper(inorder, postorder, inIndex + 1, inEnd);
        root.left = buildTreeHelper(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    private int findIndex(int[] arr, int value, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}
