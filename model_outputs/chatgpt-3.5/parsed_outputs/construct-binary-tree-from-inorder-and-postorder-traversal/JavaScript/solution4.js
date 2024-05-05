var buildTree = function(inorder, postorder) {
    const build = (inStart, inEnd, postStart, postEnd) => {
        if (inStart > inEnd) return null;
        
        const rootVal = postorder[postEnd];
        const root = new TreeNode(rootVal);
        const rootIndex = inorder.indexOf(rootVal);
        const rightTreeSize = inEnd - rootIndex;
        
        root.left = build(inStart, rootIndex - 1, postStart, postEnd - rightTreeSize - 1);
        root.right = build(rootIndex + 1, inEnd, postEnd - rightTreeSize, postEnd - 1);
        
        return root;
    };
    
    return build(0, inorder.length - 1, 0, postorder.length - 1);
};