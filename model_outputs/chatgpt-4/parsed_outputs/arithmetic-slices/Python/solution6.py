class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        if len(nums) < 3:
            return 0
        count, length = 0, 2
        for i in range(2, len(nums)):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                length += 1
                count += length - 2
            else:
                if length >= 3:
                    count += (length -

1) * (length - 2) // 2
                length = 2
        return count + (length - 1) * (length - 2) // 2 if length >= 3 else count