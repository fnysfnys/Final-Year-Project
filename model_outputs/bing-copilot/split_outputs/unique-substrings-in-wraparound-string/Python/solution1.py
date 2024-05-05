class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Initialize an array to store the length of longest increasing substring ending at each position
        len_inc_substring = [0] * len(s)
        # Initialize a dictionary to store the count of distinct substrings starting with each letter
        count = [0] * 26
        
        for i in range(len(s)):
            # Update the length of longest increasing substring ending at each position
            if i > 0 and (ord(s[i]) - ord(s[i-1]) + 26) % 26 == 1:
                len_inc_substring[i] = len_inc_substring[i-1] + 1
            else:
                len_inc_substring[i] = 1
            
            # Update the count of distinct substrings starting with each letter
            count[ord(s[i]) - ord('a')] = max(count[ord(s[i]) - ord('a')], len_inc_substring[i])
        
        # Return the sum of counts for all letters
        return sum(count)
