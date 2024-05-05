var buildTree = function(inorder, postorder) {
  const stack = [];
  let root = new TreeNode(postorder.pop());
  stack.push(root);
  while (inorder.length) {
    let nextVal = inorder.pop();
    let last = stack[stack.length - 1];
    if (last.val !== nextVal) {
      last.right = new TreeNode(nextVal);
      stack.push(last.right);
    } else {
      stack.pop();
      last.left = new TreeNode(nextVal);
      stack.push(last.left);
    }
  }
  return root;
};
