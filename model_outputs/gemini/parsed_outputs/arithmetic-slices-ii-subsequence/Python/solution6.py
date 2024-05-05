class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        if n < 3:
            return 0
        diff = set()
        count = 0
        for i in range(1, n):
            for j in range(i):
                d = nums[i] - nums[j]
                if d in diff:
                    count += 1
                diff.add(d)
        return count
    
