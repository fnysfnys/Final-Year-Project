class Solution:
    def buildTree(self, inorder, postorder):
        preorder = postorder[::-1]

        def buildTreeHelper(start, end):
            if start > end:
                return None

            root_val = preorder.pop(0)
            root = TreeNode(root_val)
            inorder_index = inorder.index(root_val)

            root.left = buildTreeHelper(start, inorder_index - 1)
            root.right = buildTreeHelper(inorder_index + 1, end)

            return root

        return buildTreeHelper(0, len(inorder) - 1)