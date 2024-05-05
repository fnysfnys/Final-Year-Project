class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        ... (docstring here) ...
        """
        if buckets == 1:
            return 0
        return self.poorPigs(buckets - 1, minutesToDie, minutesToTest) + 1