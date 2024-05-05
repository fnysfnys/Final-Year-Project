class Solution(object):
    def lengthOfLIS(self, nums):
        def merge(nums, l, m, r):
            merged = []
            i, j = l, m + 1
            while i <= m and j <= r:
                if nums[i] <= nums[j]:
                    merged.append(nums[i])
                    i += 1
                else:
                    merged.append(nums[j])
                    j += 1
            merged.extend(nums[i:])
            merged.extend(nums[j:])
            nums[l:r + 1] = merged
    
        def merge_sort(nums, l, r):
            if l < r:
                m = (l + r) // 2
                merge_sort(nums, l, m)
                merge_sort(nums, m + 1, r)
                merge(nums, l, m, r)
    
        merge_sort(nums, 0, len(nums) - 1)
        return nums.index(max(nums)) + 1
    
    # Time complexity: O(n log n), Space complexity: O(n)
    
