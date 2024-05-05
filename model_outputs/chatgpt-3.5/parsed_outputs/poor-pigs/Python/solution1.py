class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        ... (docstring here) ...
        """
        import math
        return math.ceil(math.log(buckets) / math.log(minutesToTest // minutesToDie + 1))