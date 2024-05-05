from heapq import heappop, heappush

def splitArray(self, nums, k):
    pq = []
    for num in nums:
        heappush(pq, -num)
    
    max_sum = 0
    for _ in range(k - 1):
        largest = heappop(pq)
        max_sum -= largest
        heappush(pq, largest // 2)
    
    return -heappop(pq)
