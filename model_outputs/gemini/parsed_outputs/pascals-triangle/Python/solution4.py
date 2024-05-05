class Solution(object):
    def generate(self, numRows):
        return [[1] * (i + 1) if i == 0 else [1] + [c + d for c, d in zip(x[:-1], x[1:])] + [1] for i, x in enumerate(self.generate(numRows - 1)) if i < numRows]
    
