class Solution(object):
    def twoSum(self, nums, target):
        seen = set()
        for i, num in enumerate(nums):
            if target - num in seen:
                for j in range(i):
                    if nums[j] == target - num:
                        return [j, i]
            seen.add(num)