class Solution(object):
    def twoSum(self, nums, target):
        sorted_nums = sorted((num, i) for i, num in enumerate(nums))
        left, right = 0, len(nums) - 1
        while left < right:
            sum = sorted_nums[left][0] + sorted_nums[right][0]
            if sum == target:
                return [sorted_nums[left][1], sorted_nums[right][1]]
            elif sum < target:
                left += 1
            else:
                right -= 1
