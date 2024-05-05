class Solution {
    int postIndex;
    int[] inorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        inorderIndex = new int[6001]; // assuming values are in the range -3000 to 3000

        for (int i = 0; i < inorder.length; i++) {
            inorderIndex[inorder[i] + 3000] = i;
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart

> inEnd) return null;

        TreeNode root = new TreeNode(postorder[postIndex--]);
        int inIndex = inorderIndex[root.val + 3000];

        root.right = build(inorder, postorder, inIndex + 1, inEnd);
        root.left = build(inorder, postorder, inStart, inIndex - 1);

        return root;
    }
}