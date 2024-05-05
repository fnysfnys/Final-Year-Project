class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
           return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
       }
       
       private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
           if (inStart > inEnd || postStart > postEnd) {
               return null;
           }
           int rootVal = postorder[postEnd];
           TreeNode root = new TreeNode(rootVal);
           int rootIndex = inStart;
           while (inorder[rootIndex] != rootVal) {
               rootIndex++;
           }
           int leftSize = rootIndex - inStart;
           root.left = buildTreeHelper(inorder, postorder, inStart, rootIndex - 1, postStart, postStart + leftSize - 1);
           root.right = buildTreeHelper(inorder, postorder, rootIndex + 1, inEnd, postStart + leftSize, postEnd - 1);
           return root;
       }
       
}
