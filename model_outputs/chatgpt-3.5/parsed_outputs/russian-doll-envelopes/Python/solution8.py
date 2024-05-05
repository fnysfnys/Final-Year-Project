class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        lis = set()
        for _, h in envelopes:
            pos = bisect_left(lis, h)
            if pos == len(lis):
                lis.add(h)
            else:
                lis.remove(lis[pos])
                lis.add(h)
        return len(lis)
