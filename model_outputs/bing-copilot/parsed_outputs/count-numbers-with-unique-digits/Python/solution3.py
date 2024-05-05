class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        def dfs(pos, used):
            if pos == n:
                return 1
            count = 1
            for digit in range(10):
                if digit == 0 and pos == 1:
                    continue
                if not used[digit]:
                    used[digit] = True
                    count += dfs(pos + 1, used)
                    used[digit] = False
            return count

        if n == 0:
            return 1
        return dfs(0, [False] * 10)
