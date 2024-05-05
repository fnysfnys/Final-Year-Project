class Solution(object):
    def maxRotateFunction(self, nums):
        """
        You are given an integer array nums of length n.
        Assume arrk to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow:
        
        F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
        
        Return a list of k values that maximize F(k).
        The test cases are generated so that the answer fits in a 32-bit integer.
        """
        if not nums:
            return []
        n = len(nums)
        max_f = float('-inf')
        max_k_values = []
        for k in range(n):
            f_k = sum(i * nums[(n - k + i) % n] for i in range(n))
            if f_k > max_f:
                max_f = f_k
                max_k_values = [k]
            elif f_k == max_f:
                max_k_values.append(k)
        return max_k_values