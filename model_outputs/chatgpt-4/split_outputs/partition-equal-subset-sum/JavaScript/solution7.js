var canPartition = function(nums) {
    nums.sort((a, b) => b - a);
    let sum = nums.reduce((acc, val) => acc + val, 0);
    if (sum % 2 !==

 0) return false;
    let target = sum / 2, subsetSum = 0;

    for (let num of nums) {
        subsetSum += num;
        if (subsetSum === target) return true;
        if (subsetSum > target) return false;
    }

    return false;
};
