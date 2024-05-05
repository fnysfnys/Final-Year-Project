   class Solution:
       def generate(self, numRows):
           from math import comb
           return [[comb(i, j) for j in range(i + 1)] for i in range(numRows)]
   