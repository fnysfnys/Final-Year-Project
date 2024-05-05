class Solution(object):
    def buildTree(self, inorder, postorder):
        def build(in_start, in_end, post_start, post_end):
            if in_start > in_end:
                return None
            root_val = postorder[post_end]
            root = TreeNode(root_val)
            root_index = inorder.index(root_val)
            num_right = in_end - root_index
            root.left = build(in_start, root_index - 1, post_start, post_start + root_index - in_start - 1)
            root.right = build(root_index + 1, in_end, post_start + root_index - in_start, post_end - 1)
            return root
        
        return build(0, len(inorder) - 1, 

0, len(postorder) - 1)