class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Initialize an array to store the current length of substring starting from each character
        arr = [0] * 26
        ans = 0
        curLen = 0
        
        for i in range(len(s)):
            curr = ord(s[i]) - ord('a')
            if i > 0 and s[i-1] != chr((curr + 26 - 1) % 26 + ord('a')):
                curLen = 0
            curLen += 1
            if curLen > arr[curr]:
                ans += (curLen - arr[curr])
                arr[curr] = curLen
        
        return ans
