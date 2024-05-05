class Solution(object):
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target_sum = total_sum // 2
        nums.sort(reverse=True)
        curr_sum = 0
        
        for num in nums:
            curr_sum += num
            if curr_sum == target_sum:
                return True
            elif curr_sum > target_sum:
                return False
        
        return False
