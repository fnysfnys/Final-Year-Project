class Solution:
    def combinationSum4(self, nums, target):
        n = len(nums)
        k = sum(nums) // min(nums)  # assuming k terms in the sum
        if k * min(nums) != target:
            return 0
        return math.factorial(n + k - 1) // (math.factorial(n - 1) * math.factorial(k))
