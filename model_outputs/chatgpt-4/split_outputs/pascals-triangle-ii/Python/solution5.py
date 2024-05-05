class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        import math
        return [math.factorial(rowIndex) // (math.factorial(i) * math.factorial(rowIndex - i)) for i in range(rowIndex + 1)]
