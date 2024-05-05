class State:
  def __init__(self, hold, sold):
    self.hold, self.sold = hold, sold

def maxProfit(self, prices):
  states = [State(float('-inf'), 0), State(0, float('-inf'))]
  for price in prices:
    states[0] = State(max(states[0].hold, states[1].sold - price), states[0].sold)
    states[1] = State(max(states[0].hold + price, states[1].sold), max(states[1].sold, states[0].sold))
  return max(states[0].hold, states[1].sold)
