class Solution(object):
    def countDigitOne(self, n):
        memo = {}

        def helper(num_str, pos, has_one):
            if pos == len(num_str):
                return 1 if has_one else 0
            if (num_str, pos, has_one) in memo:
                return memo[(num_str, pos, has_one)]
            count = 0
            for digit in range(10):
                count += helper(num_str, pos + 1, has_one or digit == 1)
            memo[(num_str, pos, has_one)] = count
            return count

        return helper(str(n), 0, False)
