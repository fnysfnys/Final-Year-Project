var buildTree = function(inorder, postorder) {
    const build = (inStart, inEnd, postStart, postEnd) => {
        if (inStart > inEnd) return null;
        
        const rootVal = postorder[postEnd];
        const root = new TreeNode(rootVal);
        const rootIndex = inorder.indexOf(rootVal);
        
        root.right = build(rootIndex + 1, inEnd, postStart + rootIndex - inStart, postEnd - 1);
        root.left = build(inStart, rootIndex - 1, postStart, postStart + rootIndex - inStart - 1);
        
        return root;
    };
    
    return build(0, inorder.length - 1, 0, postorder.length - 1);
};