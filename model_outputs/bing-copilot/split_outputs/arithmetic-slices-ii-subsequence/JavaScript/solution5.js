var numberOfArithmeticSlices = function(nums) {
    let ans = 0;
    for (let len = 3; len <= nums.length; len++) {
        ans += (nums.length - len + 1);
    }
    return ans;
};
