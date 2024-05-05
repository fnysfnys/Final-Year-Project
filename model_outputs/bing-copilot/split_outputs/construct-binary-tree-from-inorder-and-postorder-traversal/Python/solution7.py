    class Solution(object):
        def buildTree(self, inorder, postorder):
            stack, root = [], None

            for val in reversed(postorder):
                node = TreeNode(val)

                while stack and stack[-1].val == inorder[-1]:
                    root = stack.pop()
                    inorder.pop()

                node.left = root
                stack.append(node)
                root = None

            return stack[0]
    