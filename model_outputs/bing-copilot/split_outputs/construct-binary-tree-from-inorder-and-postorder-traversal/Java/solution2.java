   public TreeNode buildTree(int[] inorder, int[] postorder) {
       Stack<TreeNode> stack = new Stack<>();
       TreeNode prev = null;
       for (int i = postorder.length - 1, j = inorder.length - 1; i >= 0; i--) {
           TreeNode curr = new TreeNode(postorder[i]);
           while (!stack.isEmpty() && stack.peek().val == inorder[j]) {
               prev = stack.pop();
               j--;
           }
           if (prev != null) {
               prev.left = curr;
           } else if (!stack.isEmpty()) {
               stack.peek().right = curr;
           }
           stack.push(curr);
           prev = null;
       }
       return stack.isEmpty() ? null : stack.peek();
   }
   