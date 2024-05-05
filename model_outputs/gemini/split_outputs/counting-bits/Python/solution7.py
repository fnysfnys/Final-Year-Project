def countBits_hamming(n):
  from functools import lru_cache

  @lru_cache(maxsize=None)
  def hamming_weight(num):
    count = 0
    while num > 0:
      count += num & 1
      num >>= 1
    return count

  ans = [0] * (n + 1)
  for i in range(n + 1):
    ans[i] = hamming_weight(i)
  return ans
