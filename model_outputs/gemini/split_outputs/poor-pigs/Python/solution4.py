class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        if buckets == 1:
            return 0
        if minutesToTest <= minutesToDie:
            return -1
        
        def dfs(pigs, used, timeLeft):
            nonlocal minPigs
            if pigs >= minPigs:
                return
            if timeLeft < 0:
                return
            if used == (1 << buckets) - 1:
                minPigs = min(minPigs, pigs)
                return
            
            for i in range(buckets):
                if not used & (1 << i):
                    used |= 1 << i
                    dfs(pigs + 1, used, timeLeft - minutesToDie)
                    used &= ~(1 << i)
        
        minPigs = float('inf')
        dfs(0, 0, minutesToTest)
        return minPigs if minPigs != float('inf') else -1
