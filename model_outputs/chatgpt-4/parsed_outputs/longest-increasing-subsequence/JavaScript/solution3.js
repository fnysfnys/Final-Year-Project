var lengthOfLIS = function(nums) {
    const memo = Array(nums.length).fill(-1);

    function lis(index, prevIndex) {
        if (index === nums.length) return 0;
        if (memo[index] !== -1 && prevIndex < memo[index]) return memo[index];

        let taken = 0;
        if (prevIndex < 0 || nums[index] > nums[prevIndex]) {
            taken = 1 + lis(index + 1, index);
        }
        const notTaken = lis(index + 1, prevIndex);

        memo[index] = Math.max(taken, notTaken);
        return memo[index];
    }

    return lis(0, -1);
};