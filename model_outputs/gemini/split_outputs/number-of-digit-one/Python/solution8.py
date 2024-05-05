def countDigitOne(n):
  return sum(str(i).count("1") for i in range(1, n + 1))
