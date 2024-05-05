class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        ugly = [1]
        i2 = i3 = i5 = 0
        while True:
            next2, next3, next5 = 2 * ugly[i2], 3 * ugly[i3], 5 * ugly[i5]
            next_ugly = min(next2, next3, next5)
            if len(ugly) == n:
                return ugly[-1]
            if next_ugly not in ugly:
                ugly.append(next_ugly)
            if next_ugly == next2:
                i2 += 1
            elif next_ugly == next3:
                i3 += 1
            else:
                i5 += 1