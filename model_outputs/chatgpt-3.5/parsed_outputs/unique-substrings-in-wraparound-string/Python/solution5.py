class Solution(object):
    def findSubstringInWraproundString(self, s):
        base = "abcdefghijklmnopqrstuvwxyz"
        max_len = 0
        
        def substr_count(s):
            for i in range(len(s)):
                if i > 0 and (ord(s[i]) - ord(s[i-1]) == 1 or ord(s[i-1]) - ord(s[i]) == 25):
                    max_len += 1
                else:
                    max_len = 1
                yield max_len
        
        return sum(substr_count(s))