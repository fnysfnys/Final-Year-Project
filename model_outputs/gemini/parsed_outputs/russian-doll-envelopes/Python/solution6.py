class SegmentTree:
  def __init__(self, n):
    self.n = n
    self.st = [float('-inf')] * (2 * n - 1)

  def update(self, i, val):
    i += self.n - 1
    self.st[i] = val
    while i > 1:
      i //= 2
      self.st[i] = max(self.st[2 * i], self.st[2 * i + 1])

  def query(self, l, r):
    l += self.n - 1
    r += self.n - 1
    res = float('-inf')
    while l <= r:
      if l % 2 == 0:
        res = max(res, self.st[l])
      if r % 2 == 1:
        res = max(res, self.st[r])
      l //= 2
      r //= 2
    return res

class Solution(object):
  def maxEnvelopes(self, envelopes):
    envelopes.sort(key=lambda e: (e[0], e[1]))
    segtree = SegmentTree(len(envelopes))
    res = 0
    for _, h in envelopes:
      prev = segtree.query(0, h - 1)
      segtree.update(h, prev + 1)
      res = max(res, prev + 1)
    return res
