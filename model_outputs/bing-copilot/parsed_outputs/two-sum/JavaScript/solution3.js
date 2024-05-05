var twoSum = function(nums, target) {
    const sortedNums = [...nums].sort((a, b) => a - b);
    let left = 0;
    let right = sortedNums.length - 1;
    while (left < right) {
        const sum = sortedNums[left] + sortedNums[right];
        if (sum === target) {
            return [nums.indexOf(sortedNums[left]), nums.lastIndexOf(sortedNums[right])];
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return []; // No valid solution found
};
