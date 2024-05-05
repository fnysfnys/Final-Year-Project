class Solution:
    def canPartition(self, nums):
        nums.sort(reverse=True)
        bucket = [0, 0]
        
        def dfs(index):
            if index == len(nums):
                return bucket[0] == bucket[1]
            for i in range(2):
                bucket[i] += nums[index]
                if dfs(index + 1):
                    return True
                bucket[i] -= nums[index]
            return False
        
        total = sum(nums)
        if total % 2 != 0:
            return False
        return dfs(0)