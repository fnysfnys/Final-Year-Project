class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
             if buckets == 1:
                 return 0
             return 1 + self.poorPigs(buckets - 1, minutesToDie, minutesToTest)
         
