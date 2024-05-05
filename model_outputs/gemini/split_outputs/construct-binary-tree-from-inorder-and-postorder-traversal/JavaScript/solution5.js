var buildTree = function(inorder, postorder) {
  let curr = new TreeNode(postorder.pop()), prev = null;
  while (postorder.length) {
    let val = postorder.pop();
    if (prev && prev.val === val) {
      prev.right = curr;
      curr = prev;
    } else {
      const node = new TreeNode(val);
      if (curr.left) {
        node.right = curr.left;
      }
      curr.left = node;
    }
    prev = curr;
  }
  return curr;
};
