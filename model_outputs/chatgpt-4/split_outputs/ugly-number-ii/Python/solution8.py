class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        def generate_ugly():
            yield 1
            ugly = [1]
            i2 = i3 = i5 = 0
            while True:
                next_ugly = min(2 * ugly[i2], 3 * ugly[i3], 5 * ugly[i5])
                yield next_ugly
                if next_ugly == 2 * ugly[i2]:
                    i2 += 1
                if next_ugly == 3 * ugly[i3]:
                    i3 += 1
                if next_ugly == 5 * ugly[i5]:
                    i5 += 1
                ugly.append(next_ugly)

        ugly_gen = generate_ugly()
        for _ in range(n):
            result = next(ugly_gen)
        return result
