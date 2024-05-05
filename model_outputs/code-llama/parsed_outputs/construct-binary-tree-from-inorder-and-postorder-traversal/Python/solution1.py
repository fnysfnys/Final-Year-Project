class Solution(object):
    def buildTree(self, inorder, postorder):
       if not inorder:
           return None
       root = TreeNode(postorder.pop())
       root.left = self.buildTree(inorder[:inorder.index(root.val)], postorder)
       root.right = self.buildTree(inorder[inorder.index(root.val)+1:], postorder)
       return root
    
