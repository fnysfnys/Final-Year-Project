/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    if (postorder.length === 0) return null;

    let root = new TreeNode(postorder.pop());
    let stack = [root];
    let inorderIndex = inorder.length - 1;

    while (postorder.length) {
        let node = new TreeNode(postorder.pop());
        let current = null;
        while (stack.length && stack[stack.length - 1].val === inorder[inorderIndex]) {
            current = stack.pop();
            inorderIndex--;
        }
        if (current) {
            current.left = node;
        } else if (stack.length) {
            stack[stack.length - 1].right = node;
        }
        stack.push(node);
    }
    return root;
};
