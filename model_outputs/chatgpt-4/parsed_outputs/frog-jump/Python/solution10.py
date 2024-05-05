class Solution(object):
    def canCross(self, stones):
        path = []
        def dfs(position, lastJump):
            if position == stones[-1]:
                path.append(position)
                return True
            for jump in range(lastJump-1, lastJump+2):
                if jump > 0 and position+jump in stoneSet:
                    if dfs(position+jump, jump):
                        path.append(position)
                        return True
            return False
        
        stoneSet = set(stones)
        if dfs(0, 1):
            return True, path[::-1]
        else:
            return False, []
    
