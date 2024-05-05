class Solution(object):
    def splitArray(self, nums, k):
        low, high = 0, sum(nums)
        while low <= high:
            mid = (low + high) // 2
            if self.isPossible(nums, mid, k):
                high = mid - 1
            else:
                low = mid + 1
        return low
    
    def isPossible(self, nums, max_sum, k):
        subarrays, current_sum = 0, 0
        for num in nums:
            if current_sum + num <= max_sum:
                current_sum += num
            else:
                subarrays += 1
                current_sum = num
        return subarrays + 1 <= k
    
