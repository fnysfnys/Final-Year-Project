def countBits_shift_mask(n):
  ans = [0] * (n + 1)
  for i in range(n + 1):
    count = 0
    mask = 1
    while mask <= i:
      if i & mask > 0:
        count += 1
      mask <<= 1
    ans[i] = count
  return ans
