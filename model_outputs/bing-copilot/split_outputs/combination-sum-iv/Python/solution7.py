from itertools import combinations_with_replacement

class Solution(object):
    def combinationSum4(self, nums, target):
        count = 0
        for combo in combinations_with_replacement(nums, target):
            if sum(combo) == target:
                count += 1
        return count
