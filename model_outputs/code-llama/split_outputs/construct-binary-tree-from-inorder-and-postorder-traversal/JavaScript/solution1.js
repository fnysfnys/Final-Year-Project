function buildTree(inorder, postorder) {
 if (inorder.length === 0) {
   return null;
 }

 const root = new TreeNode(postorder.pop());
 const inorderRootIndex = inorder.indexOf(root.val);

 root.left = buildTree(inorder.slice(0, inorderRootIndex), postorder.slice(0, inorderRootIndex));
 root.right = buildTree(inorder.slice(inorderRootIndex + 1), postorder.slice(inorderRootIndex + 1));

 return root;
}
