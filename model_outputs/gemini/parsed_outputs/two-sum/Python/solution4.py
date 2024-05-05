class Solution(object):
    def twoSum(self, nums, target):
        low, high = 0, len(nums) - 1
        sorted_nums = sorted(nums)
        while low < high:
            sum = sorted_nums[low] + sorted_nums[high]
            if sum == target:
                return [nums.index(sorted_nums[low]), nums.index(sorted_nums[high])]
            elif sum < target:
                low += 1
            else:
                high -= 1
    
