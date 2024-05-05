class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        n = len(nums)
        if n < 3:
            return 0

        dp = [{} for _ in range(n)]
        count = 0
        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                if diff in dp[j]:
                    dp[i][diff] = dp[j][diff] + 1
                else:
                    dp[i][diff] = 1
                count += dp[i][diff] - 1

        return count
