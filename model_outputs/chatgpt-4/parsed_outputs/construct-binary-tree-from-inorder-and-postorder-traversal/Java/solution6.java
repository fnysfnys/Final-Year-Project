class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int mid = 0;
        while (inorder[mid] != root.val) mid++;

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, mid), Arrays.copyOfRange(postorder, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(inorder, mid + 1, inorder.length), Arrays.copyOfRange(postorder, mid, postorder.length - 1));

        return root;
    }
}