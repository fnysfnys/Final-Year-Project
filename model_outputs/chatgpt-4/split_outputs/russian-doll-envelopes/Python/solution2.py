class Solution:
    def maxEnvelopes(self, envelopes):
        def binary_search(lst, x):
            lo, hi = 0, len(lst)
            while lo < hi:
                mid = (lo + hi) // 2
                if lst[mid] < x:
                    lo = mid + 1
                else:
                    hi = mid
            return lo

        envelopes.sort(key=lambda x: (x[0], -x[1]))
        lis = []
        for _, h in envelopes:
            pos = binary_search(lis, h)
            if pos == len(lis):
                lis.append(h)
            else:
                lis[pos] = h
        return len(lis)
