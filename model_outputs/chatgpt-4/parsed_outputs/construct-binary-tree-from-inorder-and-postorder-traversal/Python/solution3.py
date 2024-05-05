class Solution:
    def buildTree(self, inorder, postorder):
        map_inorder = {val: idx for idx, val in enumerate(inorder)}

        def buildTreeHelper(start, end):
            if start > end:
                return None

            root_val = postorder.pop()
            root = TreeNode(root_val)
            root.right = buildTreeHelper(map_inorder[root_val] + 1, end)
            root.left = buildTreeHelper(start, map_inorder[root_val] - 1)

            return root

        return buildTreeHelper(0, len(inorder) - 1)