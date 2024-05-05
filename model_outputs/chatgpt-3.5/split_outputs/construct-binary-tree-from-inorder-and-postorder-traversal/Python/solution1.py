class Solution(object):
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None
        root_val = postorder.pop()
        root = TreeNode(root_val)
        root_index = inorder.index(root_val)
        root.right = self.buildTree(inorder[root_index + 1:], postorder)
        root.left = self.buildTree(inorder[:root_index], postorder)
        return root
