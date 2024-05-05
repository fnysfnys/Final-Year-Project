def splitArray(nums, k):
   # Initialize a variable to store the largest sum
   largest_sum = 0
   
   # Iterate over the input array
   for i in range(len(nums)):
       # Calculate the sum of the current subarray
       sum = sum(nums[i::k])
       # If the sum is greater than the largest sum, update the largest sum
       if sum > largest_sum:
           largest_sum = sum
   
   # Return the largest sum
   return largest_sum
