class Solution(object):
    def lengthOfLIS(self, nums):
        def update(bit, i, val):
            while i < len(bit):
                bit[i] = max(bit[i], val)
                i += i & -i

        def query(bit, i):
            res = 0
            while i > 0:
                res = max(res, bit[i])
                i -= i & -i
            return res

        n = len(nums)
        bit = [0] * (n + 1)
        for num in nums:
            update(bit, num, query(bit, num - 1) + 1)
        return query(bit, n)
