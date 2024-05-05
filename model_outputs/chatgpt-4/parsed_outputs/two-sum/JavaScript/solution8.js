function twoSum(nums, target) {
    const numMap = nums.map((num, index) => ({ num, index })).sort((a, b) => a.num - b.num);
    let left = 0, right = numMap.length - 1;
    while (left < right) {
        const sum = numMap[left].num + numMap[right].num;
        if (sum === target) {
            return [numMap[left].index, numMap[right].index];
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
}