class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        def coinChangeRec(amt):
            if amt < 0: return float('inf')
            if amt == 0: return 0
            return min(coinChangeRec(amt - c) if amt - c >= 0 else float('inf') for c in coins) + 1

        result = coinChangeRec(amount)
        return result if result != float('inf') else -1
