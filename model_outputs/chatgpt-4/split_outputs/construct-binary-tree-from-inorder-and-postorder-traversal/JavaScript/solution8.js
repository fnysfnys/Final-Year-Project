/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    function findIndex(arr, value) {
        return arr.indexOf(value);
    }

    function build(start, end) {
        if (start > end) return null;

        let rootValue = postorder.pop();
        let root = new TreeNode(rootValue);
        let index = findIndex(inorder, rootValue);

        root.right = build(index + 1, end);
        root.left = build(start, index - 1);

        return root;
    }

    return build(0, inorder.length - 1);
};
