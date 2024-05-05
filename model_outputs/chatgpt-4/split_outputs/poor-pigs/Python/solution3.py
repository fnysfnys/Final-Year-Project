class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        def helper(buckets, rounds):
            if rounds == 0:
                return 0
            pigs = 0
            while (rounds + 1) ** pigs < buckets:
                pigs += 1
            return pigs
        return helper(buckets, minutesToTest // minutesToDie)
