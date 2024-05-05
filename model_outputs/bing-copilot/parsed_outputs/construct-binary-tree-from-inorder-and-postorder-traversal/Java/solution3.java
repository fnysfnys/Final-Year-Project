class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
           Map<Integer, Integer> indexMap = new HashMap<>();
           for (int i = 0; i < inorder.length; i++) {
               indexMap.put(inorder[i], i);
           }
           return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, indexMap);
       }
       // Helper function similar to the recursive approach
       
}
