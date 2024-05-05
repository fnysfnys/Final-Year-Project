from collections import Counter

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        count = 0
        for i in range(len(nums)):
            counter = Counter()
            for j in range(i + 1, len(nums)):
                diff = nums[j] - nums[i]
                count += counter[diff]
                counter[diff] += 1
        return count