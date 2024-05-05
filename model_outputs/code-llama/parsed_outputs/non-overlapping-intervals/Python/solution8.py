from anytree import Node, RenderTree

class Solution(object):
    def eraseOverlapIntervals(self, intervals):
       root = Node("root")
       for interval in intervals:
           root.add_child(Node(interval))
       removed = 0
       for node in root.children:
           if node.interval[1] > node.parent.interval[0]:
               removed += 1
               node.parent.interval[0] = node.interval[1]
       return removed
    
