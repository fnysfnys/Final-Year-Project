/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    if (!inorder.length) return null;

    let rootVal = postorder.pop();
    let root = new TreeNode(rootVal);
    let index = inorder.indexOf(rootVal);

    root.right = buildTree(inorder.slice(index + 1), postorder);
    root.left = buildTree(inorder.slice(0, index), postorder.slice(0, index));

    return root;
};
