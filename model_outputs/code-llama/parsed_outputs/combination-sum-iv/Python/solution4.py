class Solution(object):
    def combinationSum4(self, nums, target):
       nums.sort()
       index = bisect.bisect_left(nums, target)
       count = 0
       for i in range(index):
           count += 1
       return count
    
