    class Solution(object):
        def buildTree(self, inorder, postorder):
            inorder_iter, postorder_iter = iter(inorder), iter(postorder)

            def helper(stop):
                if inorder_iter.peek() == stop:
                    inorder_iter.next()
                    return None

                root_val = next(postorder_iter)
                root = TreeNode(root_val)
                root.right = helper(root_val)
                root.left = helper(stop)

                return root

            return helper(None)
    