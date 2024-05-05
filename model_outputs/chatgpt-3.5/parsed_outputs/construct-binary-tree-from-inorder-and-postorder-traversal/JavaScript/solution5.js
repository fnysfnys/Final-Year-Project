var buildTree = function(inorder, postorder) {
    if (inorder.length === 0) return null;
    
    const rootVal = postorder.pop();
    const root = new TreeNode(rootVal);
    const stack = [];
    stack.push(root);
    
    for (let i = inorder.length - 1; i >= 0; i--) {
        let currentNode = stack[stack.length - 1];
        let inorderIndex = inorder.indexOf(currentNode.val);
        
        while (inorderIndex !== i) {
            const newNode = new TreeNode(postorder.pop());
            currentNode.right = newNode;
            stack.push(newNode);
            currentNode = newNode;
            inorderIndex = inorder.indexOf(currentNode.val);
        }
        
        currentNode.left = new TreeNode(postorder.pop());
        stack.push(currentNode.left);
    }
    
    return root;
};