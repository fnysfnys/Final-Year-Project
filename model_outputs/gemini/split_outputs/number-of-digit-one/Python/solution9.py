def countDigitOne(n):
  return sum(map(lambda i: str(i).count("1"), range(1, n + 1)))
