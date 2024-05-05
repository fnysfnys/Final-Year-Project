class Solution:
    def buildTree(self, inorder, postorder):
        def buildTreeHelper(in_start, in_end, post_start, post_end):
            if in_start > in_end:
                return None

            root_val = postorder[post_end]
            root = TreeNode(root_val)
            inorder_index = inorder.index(root_val)

            root.left = buildTreeHelper(in_start, inorder_index - 1, post_start, post_start + inorder_index - in_start - 1)
            root.right = buildTreeHelper(inorder_index + 1, in_end, post_start + inorder_index - in_start, post_end - 1)

            return root

        return buildTreeHelper(0, len(inorder) - 1, 0, len(postorder) - 1)