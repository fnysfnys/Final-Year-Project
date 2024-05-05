class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            left, right = i + 1, len(nums) - 1
            while left <= right:
                mid = left + (right - left) // 2
                if nums[i] + nums[mid] == target:
                    return [i, mid]
                elif nums[i] + nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1
