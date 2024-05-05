var buildTree = function(inorder, postorder) {
    const indexMap = new Map();
    inorder.forEach((val, index) => indexMap.set(val, index));
    
    const build = (left, right) => {
        if (left > right) return null;
        
        const rootVal = postorder.pop();
        const root = new TreeNode(rootVal);
        const inorderIndex = indexMap.get(rootVal);
        
        root.right = build(inorderIndex + 1, right);
        root.left = build(left, inorderIndex - 1);
        
        return root;
    };
    
    return build(0, inorder.length - 1);
};