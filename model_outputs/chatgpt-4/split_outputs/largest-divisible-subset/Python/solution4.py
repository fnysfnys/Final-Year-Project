class Solution(object):
    def largestDivisibleSubset(self, nums):
        def helper(index, path):
            if index == len(nums):
                return path
            included = helper(index + 1, path + [nums[index]]) if (not path or nums[index] % path[-1] == 0) else path
            excluded = helper(index + 1, path)
            return included if len(included) > len(excluded) else excluded

        nums.sort()
        return helper(0, [])
