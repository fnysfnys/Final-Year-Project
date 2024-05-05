class Solution:
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum & 1:
            return False
        target = total_sum >> 1
        bits = 1
        for num in nums:
            bits |= bits << num
        return bool(bits & (1 << target))