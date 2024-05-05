class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
       # Initialize a list to store the results
       results = []
       
       # Iterate over all possible combinations of buckets
       for i in range(1, buckets + 1):
           for j in range(1, buckets + 1):
               # Check if the current combination is valid
               if i != j:
                   # Calculate the number of pigs needed
                   num_pigs = (minutesToTest // minutesToDie) + 1
                   
                   # Add the result to the list
                   results.append((i, j, num_pigs))
       
       # Return the minimum number of pigs needed
       return min(results, key=lambda x: x[2])[2]
    
