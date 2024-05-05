from functools import lru_cache

class Solution:
    @lru_cache(None)
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        if buckets == 1:
            return 0
        if minutesToTest <= minutesToDie:
            return -1
        
        minPigs = float('inf')
        for pigs in range(1, buckets):
            remainingTime = minutesToTest - minutesToDie
            maxTests = remainingTime // minutesToDie + 1
            testsNeeded = pigs * maxTests
            remainingBuckets = buckets - pigs
            pigsNeededForRemaining = self.poorPigs(remainingBuckets, minutesToDie, remainingTime)
            if pigsNeededForRemaining != -1:
                minPigs = min(minPigs, testsNeeded + pigsNeededForRemaining)
        return minPigs
