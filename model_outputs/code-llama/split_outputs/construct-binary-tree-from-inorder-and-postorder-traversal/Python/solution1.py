def buildTree(inorder, postorder):
   if not inorder:
       return None
   root = TreeNode(postorder.pop())
   root.left = buildTree(inorder[:inorder.index(root.val)], postorder)
   root.right = buildTree(inorder[inorder.index(root.val)+1:], postorder)
   return root
