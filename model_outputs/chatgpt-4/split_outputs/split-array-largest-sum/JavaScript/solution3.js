var splitArray = function(nums, k) {
    let sum = nums.reduce((a, b) => a + b);
    let target = Math.ceil(sum / k);

    while (true) {
        let currentSum = 0, count = 1;
        for (let num of nums) {
            if (currentSum + num > target) {
                currentSum = num;
                count++;
            } else {
                currentSum += num;
            }
        }

        if (count > k) {
            target++;
        } else {
            return target;
        }
    }
};
