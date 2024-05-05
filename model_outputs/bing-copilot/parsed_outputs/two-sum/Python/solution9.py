class Solution(object):
    def twoSum(self, nums, target, start=0, chosen=[]):
           if len(chosen) == 2:
               if sum(chosen) == target:
                   return [nums.index(chosen[0]), nums.index(chosen[1])]
               return None
           for i in range(start, len(nums)):
               chosen.append(nums[i])
               result = self.twoSum(nums, target, i + 1, chosen)
               if result:
                   return result
               chosen.pop()
       
