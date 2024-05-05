import heapq

class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        heap = []
        for w, h in envelopes:
            heapq.heappush(heap, h)
            if len(heap) > 1 and heap[-1] == heap[-2]:
                heapq.heappop(heap)
        return len(heap)
