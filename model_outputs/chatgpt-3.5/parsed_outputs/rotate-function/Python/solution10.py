class Solution(object):
    def minRotateFunction(self, nums):
        """
        You are given an integer array nums of length n.
        Assume arrk to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow:
        
        F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
        
        Return the value of k that minimizes F(k).
        The test cases are generated so that the answer fits in a 32-bit integer.
        """
        if not nums:
            return 0
        n = len(nums)
        min_f = float('inf')
        min_k = 0
        for k in range(n):
            f_k = sum(i * nums[(n - k + i) % n] for i in range(n))
            if f_k < min_f:
                min_f = f_k
                min_k = k
        return min_k