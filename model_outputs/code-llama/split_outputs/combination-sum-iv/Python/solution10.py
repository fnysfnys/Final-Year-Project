def combinationSum4(nums, target):
   bitmask = 0
   for num in nums:
       bitmask |= 1 << num
   count = 0
   for i in range(len(nums)):
       count += bitmask & (1 << nums[i])
   return count
