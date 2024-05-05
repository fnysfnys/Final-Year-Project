class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        count = 0
        for i in range(len(nums)):
            diffs = set()
            for j in range(i + 1, len(nums)):
                diff = nums[j] - nums[i]
                if diff in diffs:
                    count += 1
                else:
                    diffs.add(diff)
        return count