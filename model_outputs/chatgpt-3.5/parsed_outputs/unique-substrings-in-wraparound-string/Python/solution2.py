class Solution(object):
    def findSubstringInWraproundString(self, s):
        base = "abcdefghijklmnopqrstuvwxyz"
        substrings = set()
        max_len = 0
        
        for i in range(len(s)):
            if i > 0 and (ord(s[i]) - ord(s[i-1]) == 1 or ord(s[i-1]) - ord(s[i]) == 25):
                max_len += 1
            else:
                max_len = 1
            
            for j in range(max_len):
                substrings.add(s[i-j:i+1])
        
        return len(substrings)