class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, postorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        int rootIndex = findIndex(inorder, inStart, inEnd, rootVal);
        int leftSize = rootIndex - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeHelper(inorder, inStart, rootIndex - 1, postorder, postEnd - leftSize - 1);
        root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd, postorder, postEnd - 1);
        return root;
    }
    
    private int findIndex(int[] arr, int start, int end, int val) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    } 
}
