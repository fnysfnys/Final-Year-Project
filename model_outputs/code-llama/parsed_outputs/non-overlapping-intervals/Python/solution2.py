from queue import PriorityQueue

class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       pq = PriorityQueue()
       for interval in intervals:
           pq.put(interval)
       removed = 0
       while not pq.empty():
           curr = pq.get()
           if curr[1] > pq.queue[0][0]:
               removed += 1
               pq.queue[0][0] = curr[1]
       return removed
    
