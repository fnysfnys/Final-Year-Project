class Solution:
    def buildTree(self, inorder, postorder):
        if not inorder or not postorder:
            return None

        root_val = postorder[-1]
        root = TreeNode(root_val)
        inorder_index = inorder.index(root_val)

        root.left = self.buildTree(inorder[:inorder_index], postorder[:inorder_index])
        root.right = self.buildTree(inorder[inorder_index+1:], postorder[inorder_index:-1])

        return root
