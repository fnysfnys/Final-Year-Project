class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
       memo = [0] * (n+1)
       memo[0] = 1
       for i in range(1, n+1):
           for j in range(10):
               if j not in memo[i-1] and len(str(j)) <= n and len(str(j)) >= n:
                   memo[i] += 1
       return memo[n]
    
