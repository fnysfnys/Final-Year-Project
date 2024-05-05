class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        def is_unique(num):
            return len(set(str(num))) == len(str(num))

        count = 0
        for num in range(10**n):
            if is_unique(num):
                count += 1
        return count + 1  # Account for 0
