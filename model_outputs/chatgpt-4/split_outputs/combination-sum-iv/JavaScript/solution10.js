var combinationSum4 = function(nums, target) {
    let queue = [[0, 0]]; // [current sum, count of ways]
    let count = 0;

    while (queue.length) {
        let [sum, ways] = queue.shift();
        if (sum === target) {
            count += ways;
            continue;
        }
        for (let num of nums) {
            if (sum + num <= target) {
                queue.push([sum + num, ways + 1]);
            }
        }
    }
    return count;
};
