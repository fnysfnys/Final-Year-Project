class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        pigs = 0
        while 1 << (pigs * (minutesToTest // minutesToDie)) < buckets:
            pigs += 1
        return pigs
