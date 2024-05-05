from heapq import heappush, heappop

class Solution:
    def combinationSum4(self, nums, target):
        heap = [(0, [])]
        visited = set()

        while heap:
            cost, path = heappop(heap)
            if cost == target:
                return len(path)
            if cost in visited:
                continue
            visited.add(cost)
            for num in nums:
                if cost + num <= target:
                    heappush(heap, (cost + num, path + [num]))

        return 0
