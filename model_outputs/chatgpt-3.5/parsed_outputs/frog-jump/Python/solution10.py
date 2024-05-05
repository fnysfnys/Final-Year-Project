from collections import defaultdict

class Solution(object):
    def canCross(self, stones):
        stone_set = set(stones)
        jump_dict = defaultdict(set)
        jump_dict[0].add(0)
        
        for stone in stones:
            for prev_jump in jump_dict[stone]:
                for next_jump in (prev_jump - 1, prev_jump, prev_jump + 1):
                    if next_jump > 0 and stone + next_jump in stone_set:
                        jump_dict[stone + next_jump].add(next_jump)
        
        return bool(jump_dict[stones[-1]])