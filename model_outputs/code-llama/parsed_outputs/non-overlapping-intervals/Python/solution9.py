from graph import Graph

class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       g = Graph()
       for interval in intervals:
           g.add_node(interval)
       removed = 0
       for node in g.nodes:
           if node.interval[1] > node.parent.interval[0]:
               removed += 1
               node.parent.interval[0] = node.interval[1]
       return removed
    
