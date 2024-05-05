/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    function helper(inStart, inEnd) {
        if (inStart > inEnd) return null;

        let rootVal = postorder.pop();
        let root = new TreeNode(rootVal);
        let inIndex = inorder.indexOf(rootVal);

        root.right = helper(inIndex + 1, inEnd);
        root.left = helper(inStart, inIndex - 1);

        return root;
    }
    return helper(0, inorder.length - 1);
};