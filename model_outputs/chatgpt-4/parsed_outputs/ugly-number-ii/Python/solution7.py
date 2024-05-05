class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        ugly = [1] * n
        i2 = i3 = i5 = 0

        for i in range(1, n):
            min_val = min(2 * ugly[i2], 3 * ugly[i3], 5 * ugly[i5])
            ugly[i] = min_val

            if min_val == 2 * ugly[i2]:
                i2 += 1
            if min_val == 3 * ugly[i3]:
                i3 += 1
            if min_val == 5 * ugly[i5]:
                i5 += 1

        return ugly[-1]