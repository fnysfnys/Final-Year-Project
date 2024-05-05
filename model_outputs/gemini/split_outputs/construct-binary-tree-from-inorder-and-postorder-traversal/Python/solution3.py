class Solution:
    def buildTree(self, inorder, postorder):
        """
        Combines recursion for root creation and iteration for child assignments.

        Args:
            inorder: List of integers representing the inorder traversal of the tree.
            postorder: List of integers representing the postorder traversal of the tree.

        Returns:
            TreeNode: The root node of the constructed binary tree.
        """

        if not inorder or not postorder:
            return None

        def build(in_start, in_end, post_start, post_end):
            if in_start > in_end or post_start > post_end:
                return None

            root_val = postorder[post_end]
            root_index = inorder.index(root_val)

            left_child = build(in_start, root_index-1, post_start, post_start + root_index - in_start - 1)
            right_child = build(root_index+1, in_end, post_start + root_index - in_start, post_end-1)

            return TreeNode(root_val, left_child, right_child)

        return build(0, len(inorder)-1, 0, len(postorder)-1)
