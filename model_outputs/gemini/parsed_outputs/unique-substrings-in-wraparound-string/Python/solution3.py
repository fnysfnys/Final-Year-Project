class Solution:
    def findSubstringInWraproundString(self, s: str) -> int:
        def backtrack(i, chain):
            if i == len(s):
                return len(chain) * (len(chain) + 1) // 2
            count = backtrack(i + 1, chain)
            if chain and (ord(s[i]) - ord(chain[-1]) + 26) % 26 == 1:
                count += backtrack(i + 1, chain + s[i])
            return count
        return backtrack(0, "")
