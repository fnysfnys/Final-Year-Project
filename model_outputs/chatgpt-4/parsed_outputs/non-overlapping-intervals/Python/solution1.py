class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        intervals.sort(key=lambda x: x[1])  # Sort intervals based on their end time
        count = 0  # Count of intervals to remove
        prev_end = float('-inf')  # Previous interval's end time
        
        for start, end in intervals:
            if start >= prev_end:  # No overlap
                prev_end = end  # Move to the next interval
            else:  # Overlap
                count += 1  # Need to remove an interval
        
        return count