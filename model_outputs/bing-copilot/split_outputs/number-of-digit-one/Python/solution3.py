class Solution(object):
    def countDigitOne(self, n):
        def helper(num_str):
            if not num_str:
                return 0
            first_digit = int(num_str[0])
            remaining_digits = num_str[1:]
            count = 0
            if first_digit > 1:
                count += 10 ** (len(remaining_digits))
            elif first_digit == 1:
                count += int(remaining_digits) + 1
            count += first_digit * helper(remaining_digits)
            return count

        return helper(str(n))
