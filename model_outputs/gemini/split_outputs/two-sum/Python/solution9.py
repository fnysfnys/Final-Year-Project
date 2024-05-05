def twoSum(self, nums, target):
    complement_set = {target - num for num in nums}
    for i, num in enumerate(nums):
        if num in complement_set and complement_set != {num}:  # Exclude pairs with same num
            return [i, nums.index(complement_set.pop())]
