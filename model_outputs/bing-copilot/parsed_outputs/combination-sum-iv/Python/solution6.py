from itertools import product

class Solution(object):
    def combinationSum4(self, nums, target):
        count = 0
        for combo in product(nums, repeat=target):
            if sum(combo) == target:
                count += 1
        return count
