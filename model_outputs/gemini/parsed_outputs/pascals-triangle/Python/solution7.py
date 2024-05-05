class Solution(object):
    def generate(self, numRows):
        return [[int(math.factorial(i) // math.factorial(j) // math.factorial(i - j)) for j in range(i + 1)] for i in range(numRows)]
    
