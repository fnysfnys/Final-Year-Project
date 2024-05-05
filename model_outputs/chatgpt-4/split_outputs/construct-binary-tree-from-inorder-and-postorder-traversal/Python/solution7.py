class Solution:
    def buildTree(self, inorder, postorder):
        self.post_idx = len(postorder) - 1

        def helper(in_left, in_right):
            if in_left > in_right:
                return None

            root_val = postorder[self.post_idx]
            root = TreeNode(root_val)
            self.post_idx -= 1

            inorder_index = inorder.index(root_val)
            root.right = helper(inorder_index + 1, in_right)
            root.left = helper(in_left, inorder_index - 1)

            return root

        return helper(0, len(inorder) - 1)
