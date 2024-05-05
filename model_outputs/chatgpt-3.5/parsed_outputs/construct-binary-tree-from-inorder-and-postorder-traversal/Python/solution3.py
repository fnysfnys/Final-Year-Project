class Solution(object):
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None
        root = TreeNode(postorder[-1])
        stack = [(root, inorder, postorder)]
        while stack:
            node, in_order, post_order = stack.pop()
            root_val = post_order.pop()
            root_index = in_order.index(root_val)
            if root_index + 1 < len(in_order):
                node.right = TreeNode(post_order[-1])
                stack.append((node.right, in_order[root_index + 1:], post_order))
            if root_index > 0:
                node.left = TreeNode(post_order[-1])
                stack.append((node.left, in_order[:root_index], post_order))
        return root