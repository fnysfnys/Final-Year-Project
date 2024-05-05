class Solution(object):
  def canIWin(self, maxChoosableInteger, desiredTotal):
    def minimax(remaining, depth, total, alpha, beta):
      if remaining == 0 or total >= desiredTotal:
        return desiredTotal - total if depth % 2 else 0
      for num in range(1, remaining + 1):
        if alpha >= beta: break
        score = minimax(remaining - num, depth + 1, total + num, -beta, -alpha)
        if depth % 2:
          alpha = max(alpha, score)
        else:
          beta = min(beta, score)
      return alpha if depth % 2 else beta
    return minimax(maxChoosableInteger, 0, 0, -float('inf'), float('inf')) > 0
