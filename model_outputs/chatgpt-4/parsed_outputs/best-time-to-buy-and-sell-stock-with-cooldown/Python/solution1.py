class Solution(object):
    def maxProfit(self, prices):
        if not prices:
            return 0
        
        n = len(prices)
        if n < 2:
            return 0
        
        hold, sell, cooldown = [0] * n, [0] * n, [0] * n
        hold[0] = -prices[0]
        
        for i in range(1, n):
            hold[i] = max(hold[i-1], cooldown[i-1] - prices[i])
            sell[i] = hold[i-1] + prices[i]
            cooldown[i] = max(cooldown[i-1], sell[i-1])
        
        return max(sell[n-1], cooldown[n-1])

# Example usage
sol = Solution()
print(sol.maxProfit([1,2,3,0,2])) # Output: 3
print(sol.maxProfit([1])) # Output: 0
