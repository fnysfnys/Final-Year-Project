class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        ... (docstring here) ...
        """
        trials_per_pig = minutesToTest // minutesToDie + 1
        pigs = 0
        while trials_per_pig ** pigs < buckets:
            pigs += 1
        return pigs