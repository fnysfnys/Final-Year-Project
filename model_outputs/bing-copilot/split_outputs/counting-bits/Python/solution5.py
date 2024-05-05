class Solution(object):
    def countBits(self, n):
        if n == 0:
            return [0]
        prev_ans = self.countBits(n - 1)
        return prev_ans + [x + 1 for x in prev_ans]
