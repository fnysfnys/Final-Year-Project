   def twoSum(nums, target):
       sorted_nums = sorted(enumerate(nums), key=lambda x: x[1])
       for i, num in enumerate(nums):
           complement = target - num
           left, right = 0, len(nums) - 1
           while left <= right:
               mid = left + (right - left) // 2
               if sorted_nums[mid][1] == complement:
                   return [i, sorted_nums[mid][0]]
               elif sorted_nums[mid][1] < complement:
                   left = mid + 1
               else:
                   right = mid - 1
   