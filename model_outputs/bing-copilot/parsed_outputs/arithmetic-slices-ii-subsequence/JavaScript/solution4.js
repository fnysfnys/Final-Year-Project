var numberOfArithmeticSlices = function(nums) {
    let ans = 0;
    for (let len = 3; len <= nums.length; len++) {
        for (let i = 0; i <= nums.length - len; i++) {
            const slice = nums.slice(i, i + len);
            const diff = slice[1] - slice[0];
            if (slice.every((num, idx) => num === slice[0] + idx * diff)) {
                ans++;
            }
        }
    }
    return ans;
};
