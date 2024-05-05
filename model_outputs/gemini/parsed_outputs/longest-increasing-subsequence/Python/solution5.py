from collections import deque

class Solution(object):
    def lengthOfLIS(self, nums):
        lis = deque([])
        for num in nums:
            if not lis or num > lis[-1]:
                lis.append(num)
            else:
                left = 0
                right = len(lis) - 1
                while left < right:
                    mid = (left + right) // 2
                    if lis[mid] <= num:
                        left = mid + 1
                    else:
                        right = mid
                lis[left] = num
        return len(lis)
    
    # Time complexity: O(n log n) amortized, Space complexity: O(n)
    
