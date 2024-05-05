function buildTree(inorder, postorder) {
 return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
}

function buildTreeHelper(inorder, postorder, start, end) {
 const hash = {};
 const root = new TreeNode(postorder.pop());
 hash[root.val] = root;

 while (postorder.length > 0) {
   const node = new TreeNode(postorder.pop());
   const inorderRootIndex = inorder.indexOf(node.val);

   if (inorderRootIndex > 0) {
     node.left = hash[postorder[inorderRootIndex - 1]];
     hash[node.val] = node.left;
   }

   if (inorderRootIndex < inorder.length - 1) {
     node.right = hash[postorder[inorderRootIndex + 1]];
     hash[node.val] = node.right;
   }
 }

 return root;
}
