/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    if (!inorder.length || !postorder.length) return null;

    let rootValue = postorder.pop();
    let root = new TreeNode(rootValue);
    let inorderIndex = inorder.indexOf(rootValue);

    root.right = buildTree(inorder.slice(inorderIndex + 1), postorder);
    root.left = buildTree(inorder.slice(0, inorderIndex), postorder);

    return root;
};
