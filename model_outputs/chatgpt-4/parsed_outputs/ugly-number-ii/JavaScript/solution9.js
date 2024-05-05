/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let nums = [1];
    let i = 0, j = 0, k = 0;

    while (nums.length < n) {
        let next = Math.min(nums[i] * 2, nums[j] * 3, nums[k] * 5);
        nums.push(next);
        if (next === nums[i] * 2) i++;
        if (next === nums[j] * 3) j++;
        if (next === nums[k] * 5) k++;
    }

    return nums[n - 1];
};