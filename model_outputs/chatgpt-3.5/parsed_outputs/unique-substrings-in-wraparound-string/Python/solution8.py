class Solution(object):
    def findSubstringInWraproundString(self, s):
        base = "abcdefghijklmnopqrstuvwxyz"
        max_len = 0
        
        substrings = {s[i-j:i+1] for i in range(len(s)) for j in range(max_len, -1, -1) if i-j >= 0 and (i == 0 or ord(s[i]) - ord(s[i-1]) == 1 or ord(s[i-1]) - ord(s[i]) == 25)}
        
        return len(substrings)