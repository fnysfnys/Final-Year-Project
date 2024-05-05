def countDigitOne(n):
  count = 0
  for d in range(1, 10):
    base = 10 ** (len(str(n)) - 1)
    while base > 0:
      prev_count = (n // base) * d
      if n % base >= base // 10 + 1:
        prev_count += base // 10 + 1 - (n % base)
      elif n % base == base // 10:
        prev_count += (n // base) + 1
      count += prev_count
      base //= 10
  return count
