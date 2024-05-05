     function buildTree(inorder, postorder) {
         if (inorder.length === 0 || postorder.length === 0) {
             return null;
         }
         const rootVal = postorder.pop();
         const root = new TreeNode(rootVal);
         const rootIndex = inorder.indexOf(rootVal);
         root.right = buildTree(inorder.slice(rootIndex + 1), postorder);
         root.left = buildTree(inorder.slice(0, rootIndex), postorder);
         return root;
     }
     