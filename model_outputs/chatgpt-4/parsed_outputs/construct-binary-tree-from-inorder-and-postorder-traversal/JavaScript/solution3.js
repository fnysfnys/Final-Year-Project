/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    let map = new Map();
    inorder.forEach((e, i) => map.set(e, i));

    function arrayToTree(start, end) {
        if (start > end) return null;
        let value = postorder.pop();
        let root = new TreeNode(value);
        root.right = arrayToTree(map.get(value) + 1, end);
        root.left = arrayToTree(start, map.get(value) - 1);
        return root;
    }

    return arrayToTree(0, inorder.length - 1);
};