class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest strictly increasing subsequence.
        
        ... (same docstring as provided)
        
        :type nums: List[int]
        :rtype: int
        """
        def update(bit, index, val):
            while index < len(bit):
                bit[index] = max(bit[index], val)
                index += index & (-index)
        
        def query(bit, index):
            result = 0
            while index > 0:
                result = max(result, bit[index])
                index -= index & (-index)
            return result
        
        if not nums:
            return 0
        
        sorted_nums = sorted(list(set(nums)))
        index_map = {num: index + 1 for index, num in enumerate(sorted_nums)}
        bit = [0] * (len(index_map) + 1)
        max_length = 0
        
        for num in nums:
            index = index_map[num]
            length = query(bit, index - 1) + 1
            update(bit, index, length)
            max_length = max(max_length, length)
        
        return max_length
