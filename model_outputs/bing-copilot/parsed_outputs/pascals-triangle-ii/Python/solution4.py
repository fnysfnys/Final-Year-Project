from math import comb

class Solution(object):
    def getRow(self, rowIndex):
        return [comb(rowIndex, i) for i in range(rowIndex + 1)]
