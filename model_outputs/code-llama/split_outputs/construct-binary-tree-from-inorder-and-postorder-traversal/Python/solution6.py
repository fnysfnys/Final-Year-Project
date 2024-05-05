def buildTree(inorder, postorder):
   def helper(inorder, postorder):
       stack = []
       for val in postorder:
           node = TreeNode(val)
           while stack and stack[-1].val < val:
               node.left = stack.pop()
           if stack:
               stack[-1].right = node
           stack.append(node)
       return stack[0]
   return helper(inorder, postorder)
