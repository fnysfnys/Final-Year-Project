var lengthOfLIS = function(nums) {
    const dp = [];
    for (const num of nums) {
        const idx = binarySearch(dp, num);
        if (idx === dp.length) dp.push(num);
        else dp[idx] = num;
    }
    return dp.length;
};

function binarySearch(arr, target) {
    let left = 0, right = arr.length;
    while (left < right) {
        const mid = Math.floor((left + right) / 2);
        if (arr[mid] < target) left = mid + 1;
        else right = mid;
    }
    return left;
}
