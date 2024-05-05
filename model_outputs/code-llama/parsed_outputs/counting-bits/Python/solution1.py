class Solution(object):
    def countBits(self, n):
       result = []
       for i in range(n+1):
           result.append(bin(i).count('1'))
       return result
    
