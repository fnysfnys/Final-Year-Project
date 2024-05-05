class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        if amount == 0:
            return 0

        level = {0}
        count = 0

        while level:
            count += 1
            next_level = set()
            for total in level:
                for coin in coins:
                    new_total = total + coin
                    if new_total == amount:
                        return count
                    if new_total < amount:
                        next_level.add(new_total)
            level = next_level

        return -1
