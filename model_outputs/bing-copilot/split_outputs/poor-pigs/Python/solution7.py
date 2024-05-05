     def poorPigs(buckets, minutesToDie, minutesToTest, memo={}):
         if buckets == 1:
             return 0
         if buckets in memo:
             return memo[buckets]
         memo[buckets] = 1 + poorPigs(buckets - 1, minutesToDie, minutesToTest, memo)
         return memo[buckets]
     