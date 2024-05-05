from collections import Counter

class Solution(object):
    def numDistinct(self, s, t):
        s_count, t_count = Counter(s), Counter(t)
        ans = 1
        for char in t_count:
            ans *= s_count[char] ** t_count[char]
        return ans
