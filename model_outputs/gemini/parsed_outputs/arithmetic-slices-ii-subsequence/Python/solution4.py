class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        first, second, ans = 0, 2, 0
        while first < n - 1:
            if nums[second] - nums[first] == nums[second + 1] - nums[second]:
                ans += second - first
                second += 1
            else:
                first = second
                second += 1
        return ans
    
