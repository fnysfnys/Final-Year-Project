class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        count = 0
        for i in range(len(nums)):
            for j in range(i + 2, len(nums)):
                if 2 * nums[j - 1] == nums[i] + nums[j]:
                    count += 1
        return count