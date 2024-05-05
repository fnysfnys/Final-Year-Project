var buildTree = function(inorder, postorder) {
    const build = (inLeft, inRight, postLeft, postRight) => {
        if (inLeft > inRight) return null;
        
        const rootVal = postorder[postRight];
        const root = new TreeNode(rootVal);
        const inorderIndex = inorder.indexOf(rootVal);
        const leftTreeSize = inorderIndex - inLeft;
        
        root.left = build(inLeft, inorderIndex - 1, postLeft, postLeft + leftTreeSize - 1);
        root.right = build(inorderIndex + 1, inRight, postLeft + leftTreeSize, postRight - 1);
        
        return root;
    };
    
    return build(0, inorder.length - 1, 0, postorder.length - 1);
};