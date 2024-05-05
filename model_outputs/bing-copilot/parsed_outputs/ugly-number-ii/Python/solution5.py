class Solution(object):
    def nthUglyNumber(self, n):
        ugly_numbers = {1}
        while len(ugly_numbers) < n:
            next_ugly = min(ugly_numbers) * 2
            ugly_numbers.add(next_ugly)
            ugly_numbers.add(next_ugly * 3)
            ugly_numbers.add(next_ugly * 5)
        return min(ugly_numbers)
