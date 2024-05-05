class Solution:
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None

        root = TreeNode(postorder[-1])
        stack = [root]
        inorder_index = len(inorder) - 1

        for i in range(len(postorder) - 2, -1, -1):
            node = TreeNode(postorder[i])
            current = None

            while stack and stack[-1].val == inorder[inorder_index]:
                current = stack.pop()
                inorder_index -= 1

            if current:
                current.left = node
            else:
                stack[-1].right = node

            stack.append(node)

        return root