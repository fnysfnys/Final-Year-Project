public TreeNode buildTree(int[] inorder, int[] postorder) {
   if (inorder.length == 0) {
       return null;
   }
   int rootVal = postorder[postorder.length - 1];
   int rootIndex = Arrays.binarySearch(inorder, rootVal);
   TreeNode root = new TreeNode(rootVal);
   root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootIndex), Arrays.copyOfRange(postorder, 0, rootIndex));
   root.right = buildTree(Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length), Arrays.copyOfRange(postorder, rootIndex + 1, postorder.length - 1));
   return root;
}
