class Solution(object):
    def canCross(self, stones):
        stone_set = set(stones)
        positions = [(0, 0)]
        
        while positions:
            new_positions = set()
            for pos, jump in positions:
                for next_jump in (jump - 1, jump, jump + 1):
                    if next_jump > 0 and pos + next_jump in stone_set:
                        new_positions.add((pos + next_jump, next_jump))
            if stones[-1] in [pos for pos, _ in new_positions]:
                return True
            positions = new_positions
        
        return False