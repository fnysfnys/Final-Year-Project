     def poorPigs(buckets, minutesToDie, minutesToTest):
         if buckets == 1:
             return 0
         return 1 + poorPigs(buckets - 1, minutesToDie, minutesToTest)
     