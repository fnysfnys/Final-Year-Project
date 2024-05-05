from fractions import factorial

def integerBreak(self, n):
  return max(reduce(lambda x, y: x * y, [factorial(k) for k in range(1, n // 2 + 1)]) + [factorial(n - k) for k in range(1, n // 2 + 1)])
