class Solution(object):
    def twoSum(self, nums, target):
        seen = {}
        sorted_nums = sorted(nums)
        for i, num in enumerate(sorted_nums):
            complement = target - num
            if complement in seen:
                return [sorted_nums.index(seen[complement]), i]
            seen[num] = i
    
