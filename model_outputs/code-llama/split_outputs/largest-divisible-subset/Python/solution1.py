def largestDivisibleSubset(nums):
   max_subset = []
   for i in range(len(nums)):
       subset = []
       for j in range(i, len(nums)):
           if nums[j] % nums[i] == 0:
               subset.append(nums[j])
       if len(subset) > len(max_subset):
           max_subset = subset
   return max_subset
