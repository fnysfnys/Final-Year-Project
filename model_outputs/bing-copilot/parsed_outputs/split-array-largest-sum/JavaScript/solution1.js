    var splitArray = function(nums, k) {
        const n = nums.length;
        const targetSum = nums.reduce((acc, num) => acc + num, 0) / k;
        let currentSum = 0;
        let subarrayCount = 0;

        for (let i = 0; i < n; i++) {
            currentSum += nums[i];
            if (currentSum >= targetSum) {
                subarrayCount++;
                currentSum = 0;
            }
        }

        return subarrayCount === k;
    };
    