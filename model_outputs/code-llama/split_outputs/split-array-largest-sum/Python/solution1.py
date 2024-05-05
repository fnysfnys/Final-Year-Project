def splitArray(nums, k):
   # Initialize a list to store the subarrays
   subarrays = []
   
   # Iterate over the input array
   for i in range(len(nums)):
       # If the current element is not the last element in the array,
       # add it to the current subarray
       if i != len(nums) - 1:
           subarrays.append(nums[i])
       # If the current element is the last element in the array,
       # add it to a new subarray
       else:
           subarrays.append([nums[i]])
   
   # Initialize a variable to store the largest sum
   largest_sum = 0
   
   # Iterate over the subarrays
   for subarray in subarrays:
       # Calculate the sum of the current subarray
       sum = sum(subarray)
       # If the sum is greater than the largest sum, update the largest sum
       if sum > largest_sum:
           largest_sum = sum
   
   # Return the largest sum
   return largest_sum
