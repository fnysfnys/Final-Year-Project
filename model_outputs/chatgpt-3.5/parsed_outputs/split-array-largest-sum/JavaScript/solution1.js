var splitArray = function(nums, k) {
    let left = Math.max(...nums);
    let right = nums.reduce((acc, curr) => acc + curr, 0);
    
    while (left < right) {
        const mid = Math.floor((left + right) / 2);
        if (isValid(nums, k, mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    
    return left;
};

function isValid(nums, k, maxSum) {
    let count = 1;
    let currentSum = 0;
    
    for (const num of nums) {
        if (currentSum + num > maxSum) {
            count++;
            currentSum = 0;
        }
        currentSum += num;
    }
    
    return count <= k;
}