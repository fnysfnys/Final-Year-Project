def splitArray(self, nums, k):
    low, high = 0, sum(nums) // k
    while low <= high:
        mid = (low + high) // 2
        count, current_sum = 0, 0
        for num in nums:
            if current_sum + num <= mid:
                current_sum += num
            else:
                count += 1
                current_sum = num
        if count <= k - 1:
            high = mid - 1
        else:
            low = mid + 1
    return low
