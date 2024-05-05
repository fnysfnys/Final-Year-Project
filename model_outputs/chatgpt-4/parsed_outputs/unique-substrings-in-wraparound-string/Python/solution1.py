class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...
        
        def is_in_base(sub):
            return all((ord(sub[i+1]) - ord(sub[i])) % 26 == 1 for i in range(len(sub)-1))
        
        unique_substrings = set()
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                sub = s[i:j]
                if is_in_base(sub):
                    unique_substrings.add(sub)
        return len(unique_substrings)