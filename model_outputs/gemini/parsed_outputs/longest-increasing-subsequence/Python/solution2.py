class Solution(object):
    def lengthOfLIS(self, nums):
        n = len(nums)
        dp = [1] * n  # Length of LIS ending at each index
        p = [-1] * n  # Predecessor index for reconstruction
        lis_end = 0  # Index of the last element in LIS
    
        for i in range(1, n):
            for j in range(i):
                if nums[i] > nums[j]:
                    if dp[i] < dp[j] + 1:
                        dp[i] = dp[j] + 1
                        p[i] = j
                        lis_end = i
    
        # Backtrack and reconstruct the LIS
        lis = []
        temp = lis_end
        while temp != -1:
            lis.append(nums[temp])
            temp = p[temp]
        return lis[::-1]
    
    # Time complexity: O(n^2), Space complexity: O(n)
    
