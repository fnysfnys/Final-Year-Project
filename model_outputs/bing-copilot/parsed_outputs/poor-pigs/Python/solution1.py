import math

class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
             rounds = minutesToTest // minutesToDie
             return math.ceil(math.log(buckets, rounds + 1))
         
