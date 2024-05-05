function buildTree(inorder, postorder) {
 return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
}

function buildTreeHelper(inorder, postorder, start, end) {
 if (start > end) {
   return null;
 }

 const root = new TreeNode(postorder.pop());
 const inorderRootIndex = inorder.indexOf(root.val);

 root.left = buildTreeHelper(inorder, postorder, start, inorderRootIndex - 1);
 root.right = buildTreeHelper(inorder, postorder, inorderRootIndex + 1, end);

 return root;
}
