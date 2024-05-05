/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    let indexMap = new Map();
    for (let i = 0; i < inorder.length; i++) {
        indexMap.set(inorder[i], i);
    }

    function construct(start, end) {
        if (start > end) return null;

        let value = postorder.pop();
        let root = new TreeNode(value);
        root.right = construct(indexMap.get(value) + 1, end);
        root.left = construct(start, indexMap.get(value) - 1);

        return root;
    }

    return construct(0, inorder.length - 1);
};
