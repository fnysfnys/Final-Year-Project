/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    let indexMap = inorder.reduce((acc, val, index) => (acc[val] = index, acc), {});

    function build(start, end) {
        if (start > end) return null;

        let rootVal = postorder.pop();
        let root = new TreeNode(rootVal);
        root.right = build(indexMap[rootVal] + 1, end);
        root.left = build(start, indexMap[rootVal] - 1);

        return root;
    }

    return build(0, inorder.length - 1);
};
