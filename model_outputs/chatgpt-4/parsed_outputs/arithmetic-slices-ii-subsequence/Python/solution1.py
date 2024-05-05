class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        def is_arithmetic(sub):
            d = sub[1] - sub[0]
            for i in range(2, len(sub)):
                if sub[i] - sub[i - 1] != d:
                    return False
            return True

        count = 0
        for i in range(len(nums)):
            for j in range(i + 2, len(nums) + 1):
                if is_arithmetic(nums[i:j]):
                    count += 1
        return count