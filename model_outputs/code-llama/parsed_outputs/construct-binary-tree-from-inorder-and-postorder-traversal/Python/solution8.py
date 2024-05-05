class Solution(object):
    def buildTree(self, inorder, postorder):
       queue = []
       def helper(inorder, postorder):
           for val in postorder:
               node = TreeNode(val)
               queue.append(node)
           for i, val in enumerate(inorder):
               node = queue.popleft()
               node.left = queue.popleft() if i > 0 else None
               node.right = queue.popleft() if i < len(inorder)-1 else None
           return node
       return helper(inorder, postorder)
    
