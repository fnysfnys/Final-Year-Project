class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        def backtrack(curr, used):
            nonlocal count
            if len(curr) == n:
                count += 1
                return
            for digit in range(10):
                if used & (1 << digit) == 0:  # Check if digit is used
                    curr.append(digit)
                    used |= (1 << digit)
                    backtrack(curr, used)
                    curr.pop()
                    used &= ~(1 << digit)

        count = 1  # Account for 0
        backtrack([], 0)
        return count
