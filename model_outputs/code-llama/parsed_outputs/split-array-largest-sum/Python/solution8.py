class Solution(object):
    def splitArray(self, nums, k):
       # Initialize a dictionary to store the sums of the subarrays
       sums = {}
       
       # Initialize a variable to store the largest sum
       largest_sum = 0
       
       # Iterate over the input array
       for i in range(len(nums)):
           # Calculate the sum of the current subarray
           sum = sum(nums[i::k])
           # If the sum is greater than the largest sum, update the largest sum
           if sum > largest_sum:
               largest_sum = sum
           # Update the sums of the subarrays
           sums[i] = sum
       
       # Return the largest sum
       return largest_sum
    
