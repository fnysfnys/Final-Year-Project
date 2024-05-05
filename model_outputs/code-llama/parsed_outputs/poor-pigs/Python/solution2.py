class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
       # Initialize a 2D array to store the results
       dp = [[0] * (buckets + 1) for _ in range(buckets + 1)]
       
       # Iterate over all possible combinations of buckets
       for i in range(1, buckets + 1):
           for j in range(1, buckets + 1):
               # Check if the current combination is valid
               if i != j:
                   # Calculate the number of pigs needed
                   num_pigs = (minutesToTest // minutesToDie) + 1
                   
                   # Update the 2D array
                   dp[i][j] = num_pigs
       
       # Return the minimum number of pigs needed
       return min(dp[1][1], dp[2][2], ..., dp[buckets][buckets])
    
