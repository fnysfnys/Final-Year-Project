class Solution(object):
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None
        root = TreeNode(postorder.pop())
        stack = [(root, inorder)]
        while stack:
            node, in_order = stack.pop()
            root_val = postorder[-1]
            root_index = in_order.index(root_val)
            node.right = TreeNode(postorder.pop())
            if root_index + 1 < len(in_order):
                stack.append((node.right, in_order[root_index + 1:]))
            node.left = TreeNode(postorder.pop())
            if root_index > 0:
                stack.append((node.left, in_order[:root_index]))
        return root
