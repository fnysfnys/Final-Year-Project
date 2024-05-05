class Solution:
    def combinationSum4(self, nums, target):
        counts = [0] * (target + 1)
        counts[0] = 1

        for num in nums:
            for i in range(num, target + 1):
                counts[i] += counts[i - num]

        return counts[target]
