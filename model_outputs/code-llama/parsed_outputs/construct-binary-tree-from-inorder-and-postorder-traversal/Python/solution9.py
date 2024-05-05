class Solution(object):
    def buildTree(self, inorder, postorder):
       nodes = {}
       def helper(inorder, postorder):
           if not inorder:
               return None
           root = TreeNode(postorder.pop())
           root.left = helper(inorder[:inorder.index(root.val)], postorder)
           root.right = helper(inorder[inorder.index(root.val)+1:], postorder)
           return root
       return helper(inorder, postorder)
    
