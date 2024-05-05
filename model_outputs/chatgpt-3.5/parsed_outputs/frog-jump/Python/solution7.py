class Solution(object):
    def canCross(self, stones):
        stack = [(0, 0)]
        stone_set = set(stones)
        
        while stack:
            pos, jump = stack.pop()
            if pos == stones[-1]:
                return True
            for next_jump in (jump - 1, jump, jump + 1):
                if next_jump > 0 and pos + next_jump in stone_set:
                    stack.append((pos + next_jump, next_jump))
        
        return False