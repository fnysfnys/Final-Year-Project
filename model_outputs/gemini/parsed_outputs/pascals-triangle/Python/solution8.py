@lru_cache(maxsize=None)

class Solution(object):
    def generate_row(self, i):
        return [1] * (i + 1) if i == 0 else [1] + [self.generate_row(i - 1)[j - 1] + self.generate_row(i - 1)[j] for j in range(1, i)] + [1]
    
    def generate(self, numRows):
        return [self.generate_row(i) for i in range(numRows)]
    
