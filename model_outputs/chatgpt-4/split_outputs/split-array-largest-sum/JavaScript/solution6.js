var splitArray = function(nums, k) {
    let low = Math.max(...nums), high = nums.reduce((a, b) => a + b);

    while (low < high) {
        const mid = Math.floor((low + high) / 2);
        let sum = 0, count = 1;
        for (let num of nums) {
            if (sum + num > mid) {
                count++;
                sum = num;
            } else {
                sum += num;
            }
        }
        if (count > k) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
};
