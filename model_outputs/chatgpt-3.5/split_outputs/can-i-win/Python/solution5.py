from itertools import permutations

class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using itertools for generating permutations.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        numbers = list(range(1, maxChoosableInteger + 1))
        perms = list(permutations(numbers))
        
        for perm in perms:
            total = 0
            for num in perm:
                total += num
                if total >= desiredTotal:
                    break
            if total >= desiredTotal:
                return False
        
        return True
