class Solution(object):
    def twoSum(self, nums, target):
        for i, num in enumerate(nums):
            complement = target - num
            left, right = i + 1, len(nums) - 1
            while left <= right:
                mid = (left + right) // 2
                if nums[mid] == complement:
                    return [i, mid]
                elif nums[mid] < complement:
                    left = mid + 1
                else:
                    right = mid - 1
    
