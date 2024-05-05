class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        def factorial(x):
            return 1 if x == 0 else x * factorial(x - 1)

        if n == 0:
            return 1
        return sum(factorial(9) // factorial(10 - i) for i in range(n)) + 1
