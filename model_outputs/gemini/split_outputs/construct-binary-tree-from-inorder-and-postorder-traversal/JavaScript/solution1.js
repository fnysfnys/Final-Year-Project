var buildTree = function(inorder, postorder) {
  if (!inorder.length) return null;
  const rootVal = postorder.pop();
  const rootIndex = inorder.indexOf(rootVal);
  const left = buildTree(inorder.slice(0, rootIndex), postorder.slice(0, rootIndex));
  const right = buildTree(inorder.slice(rootIndex + 1), postorder.slice(rootIndex));
  return new TreeNode(rootVal, left, right);
};
