var splitArray = function(nums, k) {
    function canSplit(maxSum) {
        let sum = 0, count = 1;
        for (let num of nums) {
            if (sum + num > maxSum) {
                sum = num;
                count++;
            } else {
                sum += num;
            }
        }
        return count <= k;
    }

    let left = Math.max(...nums), right = nums.reduce((a, b) => a + b);
    while (left < right) {
        let mid = Math.floor((left + right) / 2);
        if (canSplit(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
};