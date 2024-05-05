import itertools

class Solution(object):
    def generate(self, numRows):
        return [[1] * (i + 1) for i in range(numRows)] if numRows <= 2 else [[1] * (i + 1) if i == 0 else list(itertools.combinations(range(i + 1), i))[i // 2] for i in range(numRows)]
    
