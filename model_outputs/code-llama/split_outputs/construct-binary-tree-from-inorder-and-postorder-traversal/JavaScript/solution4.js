function buildTree(inorder, postorder) {
 const queue = [];
 const root = new TreeNode(postorder.pop());
 queue.push(root);

 while (queue.length > 0) {
   const node = queue.shift();
   const inorderRootIndex = inorder.indexOf(node.val);

   if (inorderRootIndex > 0) {
     node.left = new TreeNode(postorder.pop());
     queue.push(node.left);
   }

   if (inorderRootIndex < inorder.length - 1) {
     node.right = new TreeNode(postorder.pop());
     queue.push(node.right);
   }
 }

 return root;
}
