     def poorPigs(buckets, minutesToDie, minutesToTest):
         left, right = 0, buckets
         while left < right:
             mid = (left + right) // 2
             if (minutesToTest // minutesToDie + 1) ** mid >= buckets:
                 right = mid
             else:
                 left = mid + 1
         return left
     