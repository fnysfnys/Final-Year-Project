/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    if (postorder.length === 0) return null;

    let root = new TreeNode(postorder.pop());
    let stack = [root];
    let inStack = [];

    for (let i = inorder.length - 1; i >= 0; i--) {
        inStack.push(inorder[i]);
    }

    while (postorder.length) {
        let node = new TreeNode(postorder.pop());
        let lastInorder = inStack[inStack.length - 1];

        if (stack[stack.length - 1].val !== lastInorder) {
            stack[stack.length - 1].right = node;
        } else {
            while (stack.length && stack[stack.length - 1].val === lastInorder) {
                lastInorder = inStack.pop();
                node

 = stack.pop();
            }
            if (stack.length) {
                stack[stack.length - 1].left = node;
            }
        }
        stack.push(node);
    }

    return root;
};
