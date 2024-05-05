function twoSum(nums, target) {
    const sortedNums = nums.map((value, index) => ({ value, index })).sort((a, b) => a.value - b.value);
    let left = 0, right = nums.length - 1;
    while (left < right) {
        const sum = sortedNums[left].value + sortedNums[right].value;
        if (sum === target) {
            return [sortedNums[left].index, sortedNums[right].index];
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
}