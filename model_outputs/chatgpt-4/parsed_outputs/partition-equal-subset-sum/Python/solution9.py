class Solution:
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target = total_sum // 2
        possible_sums = set([0])
        
        for num in nums:
            new_sums = set()
            for curr_sum in possible_sums:
                new_sum = curr_sum + num
                if new_sum == target:
                    return True
                new_sums.add(new_sum)
            possible_sums.update(new_sums)
        return target in possible_sums