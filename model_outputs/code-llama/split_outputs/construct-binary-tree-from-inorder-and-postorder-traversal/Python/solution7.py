def buildTree(inorder, postorder):
   nodes = {}
   def helper(inorder, postorder):
       for val in postorder:
           nodes[val] = TreeNode(val)
       for i, val in enumerate(inorder):
           nodes[val].left = nodes[postorder[i]] if i > 0 else None
           nodes[val].right = nodes[postorder[i+1]] if i < len(inorder)-1 else None
       return nodes[postorder[0]]
   return helper(inorder, postorder)
