from collections import deque

class Solution(object):
    def buildTree(self, inorder, postorder):
        inorder.reverse()
        postorder.reverse()
        inorder = deque(inorder)
        postorder = deque(postorder)
        
        def build(inorder):
            if not inorder:
                return None
            root_val = postorder.popleft()
            root = TreeNode(root_val)
            root_index = inorder.index(root_val)
            root.right = build(inorder[root_index + 1:])
            root.left = build(inorder[:root_index])
            return root
        
        return build(inorder)
