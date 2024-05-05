def canPartition(nums):
   total = sum(nums)
   if total % 2 == 1:
       return False
   total //= 2
   subset1 = []
   subset2 = []
   for num in nums:
       if num <= total:
           subset1.append(num)
       else:
           subset2.append(num)
   return len(subset1) == len(subset2)
