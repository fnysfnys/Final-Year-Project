   from itertools import combinations

   def twoSum(nums, target):
       for i, j in combinations(range(len(nums)), 2):
           if nums[i] + nums[j] == target:
               return [i, j]
   