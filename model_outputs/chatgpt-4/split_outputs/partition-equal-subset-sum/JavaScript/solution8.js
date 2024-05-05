var canPartition = function(nums) {
    let totalSum = nums.reduce((acc, curr) => acc + curr, 0);
    if (totalSum % 2 !== 0) return false;
    let target = totalSum / 2;
    let sums = new Set([0]);

    for (let num of nums) {
        let newSums = new Set(sums);
        for (let sum of sums) {
            newSums.add(sum + num);
        }
        sums = newSums;
        if (sums.has(target)) return true;
    }

    return false;
};
