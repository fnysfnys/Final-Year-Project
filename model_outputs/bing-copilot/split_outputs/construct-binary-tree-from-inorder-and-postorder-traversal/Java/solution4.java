   public TreeNode buildTree(int[] inorder, int[] postorder) {
       int n = inorder.length;
       if (n == 0) {
           return null;
       }
       TreeNode root = new TreeNode(postorder[n - 1]);
       int rootIndex = 0;
       while (inorder[rootIndex] != root.val) {
           rootIndex++;
       }
       root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootIndex), Arrays.copyOfRange(postorder, 0, rootIndex));
       root.right = buildTree(Arrays.copyOfRange(inorder, rootIndex + 1, n), Arrays.copyOfRange(postorder, rootIndex, n - 1));
       return root;
   }
   