class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        self.res = float('inf')
        coins.sort(reverse=True)

        def dfs(index, remainder, count):
            if remainder == 0:
                self.res = min(self.res, count)
                return
            if index == len(coins):
                return

            for k in range(remainder // coins[index], -1, -1):
                if count + k >= self.res: break
                dfs(index + 1, remainder - k * coins[index], count + k)

        dfs(0, amount, 0)


        return self.res if self.res != float('inf') else -1
