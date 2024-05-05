class Solution(object):
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        """
        ... (docstring here) ...
        """
        low, high = 0, buckets
        pigs = 0
        while low < high:
            mid = (low + high) // 2
            if (minutesToTest // minutesToDie + 1) ** mid < buckets:
                low = mid + 1
            else:
                high = mid
            pigs += 1
        return pigs