class Solution(object):
    def lengthOfLIS(self, nums):
        def update(tree, i, val):
            while i < len(tree):
                tree[i] = max(tree[i], val)
                i += i & -i

        def query(tree, i):
            res = 0
            while i > 0:
                res = max(res, tree[i])
                i -= i & -i
            return res

        n = len(nums)
        tree = [0] * (n + 1)
        for num in nums:
            update(tree, num, query(tree, num - 1) + 1)
        return query(tree, n)
