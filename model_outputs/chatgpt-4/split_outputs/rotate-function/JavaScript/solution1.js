/**
 * @param {number[]} nums
 * @return {number}
 */
var maxRotateFunction = function(nums) {
    let n = nums.length;
    let sum = 0;
    let f = 0;
    // Step 1: Calculate F(0) and sum of all elements
    for (let i = 0; i < n; i++) {
        sum += nums[i];
        f += i * nums[i];
    }
    let maxF = f;
    // Step 2 & 3: Calculate F(k) based on F(k-1) and keep track of the maximum
    for (let i = 1; i < n; i++) {
        f = f + sum - n * nums[n - i];
        maxF = Math.max(maxF, f);
    }
    // Step 4: Return the maximum F(k) value
    return maxF;
};
