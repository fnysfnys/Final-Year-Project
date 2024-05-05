class Solution:
    def buildTree(self, inorder, postorder):
        """
        Constructs a binary tree based on the given inorder and postorder traversals.

        Args:
            inorder: List of integers representing the inorder traversal of the tree.
            postorder: List of integers representing the postorder traversal of the tree.

        Returns:
            TreeNode: The root node of the constructed binary tree.
        """

        if not inorder or not postorder:
            return None  # Handle empty input

        root_val = postorder[-1]  # Extract root value from postorder
        root_index = inorder.index(root_val)  # Find root's index in inorder

        left_inorder = inorder[:root_index]
        right_inorder = inorder[root_index+1:]
        left_postorder = postorder[:root_index]
        right_postorder = postorder[root_index:-1]

        left_child = self.buildTree(left_inorder, left_postorder)
        right_child = self.buildTree(right_inorder, right_postorder)

        return TreeNode(root_val, left_child, right_child)
