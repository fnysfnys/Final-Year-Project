class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        last_seen = [-1] * 26
        total = 0
        length = 0

        for i in range(len(s)):
            index = ord(s[i]) - ord('a')
            if last_seen[index] < i - length:
                length += 1
            else:
                length = 1
            last_seen[index] = i
            total += length

        return total
