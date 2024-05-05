from heapq import heapify, heappush, heappop

class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        heap = []
        for _, h in envelopes:
            heappush(heap, h)
        return len(heap)
