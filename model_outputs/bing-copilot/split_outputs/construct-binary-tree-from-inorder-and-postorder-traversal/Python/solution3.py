    class Solution(object):
        def buildTree(self, inorder, postorder):
            inorder_map = {val: i for i, val in enumerate(inorder)}

            def helper(left, right):
                if left > right:
                    return None

                root_val = postorder.pop()
                root = TreeNode(root_val)
                root_index = inorder_map[root_val]

                root.right = helper(root_index + 1, right)
                root.left = helper(left, root_index - 1)

                return root

            return helper(0, len(inorder) - 1)
    