class Solution(object):
    def twoSum(self, nums, target):
        offset = abs(min(nums))
        seen = [False] * (2 * max(nums) + 1 + offset)
        for i, num in enumerate(nums):
            index = num + offset
            if seen[index]:
                return [seen[index] - offset, i]
            seen[index] = i + offset
    
