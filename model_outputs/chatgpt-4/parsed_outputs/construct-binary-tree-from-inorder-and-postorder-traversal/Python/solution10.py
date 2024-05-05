class Solution:
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None

        stack = []
        root = TreeNode(postorder.pop())
        stack.append(root)
        inorder_index = len(inorder) - 1

        while postorder:
            node = TreeNode(postorder.pop())
            temp = None

            while stack and stack[-1].val == inorder[inorder_index]:
                temp = stack.pop()
                inorder_index -= 1

            if temp:
                temp.left = node
            else:
                stack[-1].right = node

            stack.append(node)

        return root