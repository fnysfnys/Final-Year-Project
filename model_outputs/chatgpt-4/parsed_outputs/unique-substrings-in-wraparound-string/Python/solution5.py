class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        def helper(idx, prev, cache):
            if idx == len(s):
                return 0
            if (idx, prev) in cache:
                return cache[(idx, prev)]

            include_current = 0
            if prev == -1 or (ord(s[idx]) - ord(s[prev])) % 26 == 1:
                include_current = 1 + helper(idx + 1, idx, cache)
            exclude_current = helper(idx + 1, prev, cache)

            cache[(idx, prev)] = max(include_current, exclude_current)
            return cache[(idx, prev)]

        return helper(0, -1, {})