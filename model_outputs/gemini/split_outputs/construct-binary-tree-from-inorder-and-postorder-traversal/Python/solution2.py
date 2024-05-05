class Solution:
    def buildTree(self, inorder, postorder):
        """
        Iteratively constructs a binary tree using two stacks.

        Args:
            inorder: List of integers representing the inorder traversal of the tree.
            postorder: List of integers representing the postorder traversal of the tree.

        Returns:
            TreeNode: The root node of the constructed binary tree.
        """

        if not inorder or not postorder:
            return None

        in_stack = []
        post_stack = [TreeNode(postorder[-1])]  # Pre-populate with root node

        root = post_stack[0]
        i = len(inorder) - 1

        while in_stack or post_stack:
            while postorder[-1] != inorder[i]:
                if not post_stack:
                    return None  # Unmatched elements, invalid input
                node = post_stack.pop()
                if node.right:
                    in_stack.append(node.right)
                if node.left:
                    in_stack.append(node.left)
            node = post_stack.pop()
            i -= 1

            if in_stack:
                node.right = TreeNode(in_stack.pop())
            if in_stack:
                node.left = TreeNode(in_stack.pop())

        return root
