class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        def is_arithmetic(slice):
            return all(slice[i] - slice[i - 1] == slice[1] - slice[0] for i in range(2, len(slice)))

        count = 0
        for start in range(len(nums)):
            for end in range(start + 3, len(nums) + 1):
                if is_arithmetic(nums[start:end]):
                    count += 1
        return count