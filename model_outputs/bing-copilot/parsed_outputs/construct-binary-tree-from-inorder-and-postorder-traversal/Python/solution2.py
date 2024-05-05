class Solution(object):
    def buildTree(self, inorder, postorder):
        if not inorder or not postorder:
            return None

        stack = []
        root = TreeNode(postorder[-1])
        stack.append(root)
        inorder_index = len(inorder) - 1

        for val in reversed(postorder[:-1]):
            node = TreeNode(val)
            current = stack[-1]

            while stack and stack[-1].val == inorder[inorder_index]:
                current = stack.pop()
                inorder_index -= 1

            if current:
                current.left = node
            else:
                stack[-1].right = node

            stack.append(node)

        return root
