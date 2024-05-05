/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    function build(inStart, inEnd, postStart, postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;

        let rootVal = postorder[postEnd];
        let root = new TreeNode(rootVal);
        let inRootIndex = inorder.indexOf(rootVal);

        root.left = build(inStart, inRootIndex - 1, postStart, postStart + inRootIndex - inStart - 1);
        root.right = build(inRootIndex + 1, inEnd, postStart + inRootIndex - inStart, postEnd - 1);

        return root;
    }

    return build(0, inorder.length - 1, 0, postorder.length - 1);
};
