class Solution(object):
    def canCross(self, stones):
        last_jump = 0
        for i in range(1, len(stones)):
            diff = stones[i] - stones[i - 1]
            if diff > last_jump + 1:
                return False
            last_jump = max(last_jump - 1, diff)
        return True

# Example usage (same as above)
