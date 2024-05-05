class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderMap);
    }
    
    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> inorderMap) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        
        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);
        int rootIndexInInorder = inorderMap.get(rootValue);
        int leftSubtreeSize = rootIndexInInorder - inStart;
        
        root.left = buildTreeHelper(inorder, inStart, rootIndexInInorder - 1, postorder, postStart, postStart + leftSubtreeSize - 1, inorderMap);
        root.right = buildTreeHelper(inorder, rootIndexInInorder + 1, inEnd, postorder, postStart + leftSubtreeSize, postEnd - 1, inorderMap);
        
        return root;
    }
}