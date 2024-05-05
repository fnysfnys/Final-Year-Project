var buildTree = function(inorder, postorder) {
    if (inorder.length === 0) return null;
    
    const rootVal = postorder.pop();
    const root = new TreeNode(rootVal);
    
    const rootIndexInorder = inorder.indexOf(rootVal);
    
    root.right = buildTree(inorder.slice(rootIndexInorder + 1), postorder);
    root.left = buildTree(inorder.slice(0, rootIndexInorder), postorder);
    
    return root;
};