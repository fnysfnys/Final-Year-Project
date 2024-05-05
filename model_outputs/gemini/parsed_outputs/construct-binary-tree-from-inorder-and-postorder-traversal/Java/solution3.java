class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, postorder.length - 1, map);
    }
    
    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        int rootIndex = map.get(rootVal);
        int leftSize = rootIndex - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeHelper(inorder, inStart, rootIndex - 1, postorder, postEnd - leftSize - 1, map);
        root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd, postorder, postEnd - 1, map);
        return root;
    }
    
}
