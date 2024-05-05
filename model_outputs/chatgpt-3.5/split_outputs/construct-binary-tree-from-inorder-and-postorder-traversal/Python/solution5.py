class Solution(object):
    def buildTree(self, inorder, postorder):
        inorder_dict = {val: idx for idx, val in enumerate(inorder)}
        post_idx = [len(postorder) - 1]
        
        def build(in_start, in_end):
            if in_start > in_end:
                return None
            root_val = postorder[post_idx[0]]
            root = TreeNode(root_val)
            post_idx[0] -= 1
            root_index = inorder_dict[root_val]
            root.right = build(root_index + 1, in_end)
            root.left = build(in_start, root_index - 1)
            return root
        
        return build(0, len(inorder) - 1)
