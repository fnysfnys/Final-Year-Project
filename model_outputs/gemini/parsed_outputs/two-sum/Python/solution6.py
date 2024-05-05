class Solution(object):
    def twoSum(self, nums, target):
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            key = abs(num) % len(nums)  # Custom hashing based on modulus
            if complement in seen:
                return [seen[complement], i]
            seen[key] = i
    
