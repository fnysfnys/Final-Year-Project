class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        if buckets == 1:
            return 0
        if minutesToTest <= minutesToDie:
            return -1
        
        pigs = int(math.ceil(math.log(buckets, minutesToTest // minutesToDie + 1)))
        return pigs
