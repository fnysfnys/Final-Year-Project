def numberOfArithmeticSlices(self, nums):
    n = len(nums)
    count = 0
    for i in range(n):
        for j in range(i + 2, n):
            if self.isArithmetic(nums[i:j]):
                count += 1
    return count

def isArithmetic(self, nums):
    diff = nums[1] - nums[0]
    for i in range(2, len(nums)):
        if nums[i] - nums[i - 1] != diff:
            return False
    return True
