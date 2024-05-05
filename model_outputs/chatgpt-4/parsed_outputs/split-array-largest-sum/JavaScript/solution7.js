var splitArray = function(nums, k) {
    function isValid(mid) {
        let sum = 0, count = 1;
        for (let num of nums) {
            if (sum + num > mid) {
                sum = num;
                count++;
                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;
    }

    let low = Math.max(...nums), high = nums.reduce((a, b) => a + b);
    while (low < high) {
        const mid = Math.floor((low + high) / 2);
        if (isValid(mid)) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low;
};