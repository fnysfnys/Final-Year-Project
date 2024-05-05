class Solution(object):
    def maxProfit(self, prices):
        def max_profit_recursive(prices, i, in_hold):
            if i >= len(prices):
                return 0

            if in_hold:
                return max(
                    max_profit_recursive(prices, i + 1, in_hold),
                    prices[i] + max_profit_recursive(prices, i + 2, False)
                )
            else:
                return max(
                    max_profit_recursive(prices, i + 1, in_hold),
                    -prices[i] + max_profit_recursive(prices, i + 1, True)
                )

        return max_profit_recursive(prices, 0, False)