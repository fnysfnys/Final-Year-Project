def twoSum(self, nums, target):
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen and seen[complement] != i:  # Check frequency
            return [i, seen[complement]]
        seen[num] = i
