class Solution:
    def buildTree(self, inorder, postorder):
        preorder = postorder[::-1]

        def buildTreeHelper(in_left, in_right):
            if in_left > in_right:
                return None

            root_val = preorder.pop()
            root = TreeNode(root_val)
            inorder_index = inorder.index(root_val)

            root.left = buildTreeHelper(in_left, inorder_index - 1)
            root.right = buildTreeHelper(inorder_index + 1, in_right)

            return root

        return buildTreeHelper(0, len(inorder) - 1)
