class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       dp = [0] * (len(intervals) + 1)
       for i in range(len(intervals)):
           for j in range(i+1, len(intervals)):
               if intervals[i][1] > intervals[j][0]:
                   dp[j] = max(dp[j], dp[i] + 1)
       return dp[-1]
    
