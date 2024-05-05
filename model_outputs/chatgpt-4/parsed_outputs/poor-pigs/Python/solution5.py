class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        from math import log
        tests = minutesToTest // minutesToDie
        return int(log(buckets, tests + 1)) + (log(buckets, tests + 1) > int(log(buckets, tests + 1)))