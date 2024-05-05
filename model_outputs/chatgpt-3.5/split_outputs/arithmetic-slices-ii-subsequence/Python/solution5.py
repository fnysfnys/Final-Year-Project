from itertools import combinations

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        subsequences = []
        
        for length in range(3, len(nums) + 1):
            for combo in combinations(nums, length):
                if all(combo[i] - combo[i-1] == combo[1] - combo[0] for i in range(2, length)):
                    subsequences.append(combo)
        
        return len(subsequences)
