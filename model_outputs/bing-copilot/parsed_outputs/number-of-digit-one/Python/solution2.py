class Solution(object):
    def countDigitOne(self, n):
        count = 0
        base = 1
        while base <= n:
            curr_digit = (n // base) % 10
            count += (n // (base * 10)) * base
            if curr_digit > 1:
                count += base
            elif curr_digit == 1:
                count += n % base + 1
            base *= 10
        return count
