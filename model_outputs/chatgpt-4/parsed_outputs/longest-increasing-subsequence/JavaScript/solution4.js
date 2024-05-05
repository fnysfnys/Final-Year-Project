var lengthOfLIS = function(nums) {
    const dp = [];
    for (let num of nums) {
        let low = 0, high = dp.length;
        while (low < high) {
            const mid = (low + high) >> 1;
            if (dp[mid] < num) low = mid + 1;
            else high = mid;
        }
        dp[low] = num;
    }
    return dp.length;
};