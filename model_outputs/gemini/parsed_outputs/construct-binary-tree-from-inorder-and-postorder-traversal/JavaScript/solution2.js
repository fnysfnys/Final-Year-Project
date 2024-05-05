var buildTree = function(inorder, postorder) {
  const map = {};
  for (let i = 0; i < inorder.length; i++) {
    map[inorder[i]] = i;
  }
  function helper(start, end) {
    if (start > end) return null;
    const rootVal = postorder.pop();
    const rootIndex = map[rootVal];
    const left = helper(start, rootIndex - 1);
    const right = helper(rootIndex + 1, end);
    return new TreeNode(rootVal, left, right);
  }
  return helper(0, inorder.length - 1);
};
