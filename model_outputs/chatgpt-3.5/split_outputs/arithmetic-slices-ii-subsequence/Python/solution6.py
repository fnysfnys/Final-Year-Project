class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        count = 0
        arithmetic_counts = [{} for _ in range(n)]
        
        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                if diff in arithmetic_counts[j]:
                    count += arithmetic_counts[j][diff]
                    if diff in arithmetic_counts[i]:
                        arithmetic_counts[i][diff] += arithmetic_counts[j][diff] + 1
                    else:
                        arithmetic_counts[i][diff] = arithmetic_counts[j][diff] + 1
                elif diff in arithmetic_counts[i]:
                    arithmetic_counts[i][diff] += 1
                else:
                    arithmetic_counts[i][diff] = 1
        
        return count
