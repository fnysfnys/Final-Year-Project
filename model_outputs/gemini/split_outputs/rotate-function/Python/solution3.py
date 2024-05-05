def maxRotateFunction(self, nums):
    n = len(nums)
    def helper(i, acc):
        if i == n:
            return acc
        return helper(i + 1, (acc + nums[i] * (i - 1)) % (2**31 - 1))
    return helper(0, 0)
