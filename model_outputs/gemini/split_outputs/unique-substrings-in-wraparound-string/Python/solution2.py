class Solution:
    def findSubstringInWraproundString(self, s: str) -> int:
        count = 0
        chain = []
        for char in s:
            if chain and (ord(char) - ord(chain[-1]) + 26) % 26 != 1:
                count += len(chain) * (len(chain) + 1) // 2
                chain = []
            chain.append(char)
        count += len(chain) * (len(chain) + 1) // 2
        return count
