class Solution(object):
    def canCross(self, stones):
        def canCrossHelper(stones, pos, jump):
            if pos == len(stones) - 1:
                return True
            next_positions = []
            for next_jump in (jump - 1, jump, jump + 1):
                if next_jump > 0:
                    next_position = pos + next_jump
                    idx = bisect_left(stones, next_position)
                    if idx < len(stones) and stones[idx] == next_position:
                        next_positions.append(next_position)
            for next_pos in next_positions:
                if canCrossHelper(stones, next_pos, next_pos - pos):
                    return True
            return False
        
        return canCrossHelper(stones, 0, 0)
