var combinationSum4 = function(nums, target) {
    nums.sort((a, b) => a - b); // Sort in ascending order for optimization

    function helper(t) {
        if (t === 0) return 1;
        if

(t < 0) return 0;

        let count = 0;
        for (let num of nums) {
            if (num > t) break; // Early termination
            count += helper(t - num);
        }
        return count;
    }

    return helper(target);
};
