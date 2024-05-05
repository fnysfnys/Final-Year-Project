class Solution:
    def combinationSum4(self, nums, target):
        res = []

        def backtrack(i, remaining, path):
            if remaining == 0:
                res.append(path[:])
                return
            if remaining < 0:
                return
            for j in range(i, len(nums)):
                path.append(nums[j])
                backtrack(j, remaining - nums[j], path)
                path.pop()

        backtrack(0, target, [])
        return len(res)
