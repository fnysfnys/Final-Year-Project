var buildTree = function(inorder, postorder) {
  const map = {};
  for (let i = 0; i < inorder.length; i++) {
    map[inorder[i]] = i;
  }
  const stack = [[postorder.pop(), map[postorder.pop()]]];
  while (stack.length) {
    const [val, index] = stack.pop();
    const node = new TreeNode(val);
    if (index + 1 < inorder.length && index > 0) {
      stack.push([postorder.pop(), map[inorder[index + 1]]]);
      stack.push([postorder.pop(), map[inorder[index - 1]]]);
      node.right = new TreeNode(postorder.pop());
      node.left = new TreeNode(postorder.pop());
    } else if (index + 1 < inorder.length) {
      stack.push([postorder.pop(), map[inorder[index + 1]]]);
      node.right = new TreeNode(postorder.pop());
    } else if (index > 0) {
      stack.push([postorder.pop(), map[inorder[index - 1]]]);
      node.left = new TreeNode(postorder.pop());
    }
  }
  return node;
};
