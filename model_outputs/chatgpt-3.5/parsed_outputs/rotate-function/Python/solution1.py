class Solution(object):
    def maxRotateFunction(self, nums):
        """
        You are given an integer array nums of length n.
        Assume arrk to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow:
        
        F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
        
        Return the maximum value of F(0), F(1), ..., F(n-1).
        The test cases are generated so that the answer fits in a 32-bit integer.
        """
        if not nums:
            return 0
        n = len(nums)
        f0 = sum(i * nums[i] for i in range(n))
        return f0