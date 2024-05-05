class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        from math import ceil, log
        # Calculate the number of tests we can run
        tests = minutesToTest // minutesToDie
        # Calculate the number of pigs needed
        return ceil(log(buckets) / log(tests + 1))