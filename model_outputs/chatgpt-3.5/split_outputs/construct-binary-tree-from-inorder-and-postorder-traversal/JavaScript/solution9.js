var buildTree = function(inorder, postorder) {
    const build = (inStart, inEnd, postStart, postEnd) => {
        if (inStart > inEnd) return null;
        
        const rootVal = postorder[postEnd];
        const root = new TreeNode(rootVal);
        const rootIndexInorder = inorder.indexOf(rootVal);
        const leftTreeSize = rootIndexInorder - inStart;
        
        root.left = build(inStart, rootIndexInorder - 1, postStart, postStart + leftTreeSize - 1);
        root.right = build(rootIndexInorder + 1, inEnd,

 postStart + leftTreeSize, postEnd - 1);
        
        return root;
    };
    
    return build(0, inorder.length - 1, 0, postorder.length - 1);
};
