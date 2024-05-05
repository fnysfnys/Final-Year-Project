class Solution {
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return buildTreeRecursive(inorder, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeRecursive(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(postorder[postIndex--]);

        if (start == end) return node;

        int inIndex = search(inorder, start, end, node.val);

        node.right = buildTreeRecursive(inorder, postorder, inIndex + 1, end);
        node.left = buildTreeRecursive(inorder, postorder, start, inIndex - 1);

        return node;
    }

    private int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}