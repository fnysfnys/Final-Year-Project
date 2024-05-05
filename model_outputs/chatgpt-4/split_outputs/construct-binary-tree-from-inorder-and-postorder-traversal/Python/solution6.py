class Solution:
    def buildTree(self, inorder, postorder):
        if not inorder:
            return None

        root_val = postorder.pop()
        root = TreeNode(root_val)
        inorder_index = inorder.index(root_val)

        root.right = self.buildTree(inorder[inorder_index + 1:], postorder[len(inorder[:inorder_index]):])
        root.left = self.buildTree(inorder[:inorder_index], postorder[:len(inorder[:inorder_index])])

        return root
