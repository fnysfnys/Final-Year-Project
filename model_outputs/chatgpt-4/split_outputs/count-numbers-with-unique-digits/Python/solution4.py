class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        def isUnique(num):
            return len(set(str(num))) == len(str(num))

        return sum(isUnique(i) for i in range(10**n))
