class Solution(object):
    def splitArray(self, nums, k):
        subarrays, current_sum = 0, 0
        for num in nums:
            if current_sum + num <= sum(nums) // k:
                current_sum += num
            else:
                current_sum = 0
                subarrays += 1
            if subarrays >= k:
                return current_sum
        return current_sum + num
    
