class Solution(object):
    def findSubstringInWraproundString(self, s):
        def generate_substrings(s, base, start, end):
            if start >= len(s) or end >= len(s):
                return set()
            substrings = set()
            for i in range(start, end+1):
                if base[i % 26] not in s[start:end+1]:
                    break
                substrings.add(s[start:end+1])
            return substrings | generate_substrings(s, base, start, end+1)
        
        base = "abcdefghijklmnopqrstuvwxyz"
        return len(generate_substrings(s, base, 0, 0))
