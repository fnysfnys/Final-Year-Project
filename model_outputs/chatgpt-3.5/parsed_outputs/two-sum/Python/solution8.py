from collections import defaultdict

class Solution(object):
    def twoSum(self, nums, target):
        """
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        """
        num_to_indices = defaultdict(list)
        for i, num in enumerate(nums):
            num_to_indices[num].append(i)
        
        for num in nums:
            complement = target - num
            if complement in num_to_indices:
                if complement != num:
                    return [num_to_indices[num][0], num_to_indices[complement][0]]
                elif len(num_to_indices[num]) > 1:
                    return num_to_indices[num][:2]