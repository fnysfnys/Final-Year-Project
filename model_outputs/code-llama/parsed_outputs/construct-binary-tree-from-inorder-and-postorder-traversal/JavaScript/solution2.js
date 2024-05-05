function buildTree(inorder, postorder) {
 const stack = [];
 const root = new TreeNode(postorder.pop());
 stack.push(root);

 while (stack.length > 0) {
   const node = stack.pop();
   const inorderRootIndex = inorder.indexOf(node.val);

   if (inorderRootIndex > 0) {
     node.left = new TreeNode(postorder.pop());
     stack.push(node.left);
   }

   if (inorderRootIndex < inorder.length - 1) {
     node.right = new TreeNode(postorder.pop());
     stack.push(node.right);
   }
 }

 return root;
}
