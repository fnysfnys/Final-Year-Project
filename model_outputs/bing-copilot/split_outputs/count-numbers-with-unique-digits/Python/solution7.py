class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        def helper(pos, used, memo):
            if pos == n:
                return 1
            if (pos, tuple(used)) in memo:
                return memo[(pos, tuple(used))]
            count = 1
            for digit in range(10):
                if digit == 0 and pos == 1:
                    continue
                if not used[digit]:
                    used[digit] = True
                    count += helper(pos + 1, used, memo)
                    used[digit] = False
            memo[(pos, tuple(used))] = count
            return count

        if n == 0:
            return 1
        return helper(0, [False] * 10, {})
