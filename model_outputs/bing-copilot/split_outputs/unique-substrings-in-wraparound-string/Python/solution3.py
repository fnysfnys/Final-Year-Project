class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Initialize a set to store unique substrings
        unique_substrings = set()
        curLen = 0
        
        for i in range(len(s)):
            curr = ord(s[i]) - ord('a')
            if i > 0 and s[i-1] != chr((curr + 26 - 1) % 26 + ord('a')):
                curLen = 0
            curLen += 1
            unique_substrings.add(s[i])
            unique_substrings.add(s[i-curLen+1:i+1])
        
        return len(unique_substrings)
