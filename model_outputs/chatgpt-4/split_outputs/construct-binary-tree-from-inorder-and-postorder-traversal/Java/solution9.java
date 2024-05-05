class Solution {
    private int inIndex, postIndex;
    private int[] inorder, postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        inIndex = inorder.length - 1;
        postIndex = postorder.length - 1;
        return build(0, inorder.length - 1);
    }

    private TreeNode build(int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(postorder[postIndex--]);

        if (start == end) return node;

        int index = findInorderIndex(node.val);

        node.right = build(index + 1, end);
        node.left = build(start, index - 1);

        return node;
    }

    private int findInorderIndex(int val) {
        for (int i = inIndex; i >= 0; i--) {
            if (inorder[i] == val) {
                inIndex = i;
                return i;
            }
        }
        return -1;
    }
}
