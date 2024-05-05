class Solution {
    int postIndex;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return buildTreeRecursively(inorder, postorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeRecursively(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postIndex--]);

        if (inStart == inEnd) return root;

        int inIndex = search(inorder, inStart, inEnd, root.val);

        root.right = buildTreeRecursively(inorder, postorder, inIndex + 1, inEnd);
        root.left = buildTreeRecursively(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    private int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}