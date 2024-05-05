class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        ... (docstring here) ...
        """
        pigs = 0
        while (minutesToTest // minutesToDie + 1) ** pigs < buckets:
            pigs += 1
        return pigs
