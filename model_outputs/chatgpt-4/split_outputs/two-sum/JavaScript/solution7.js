function twoSum(nums, target) {
    const filtered = nums.map((num, index) => ({ num, index })).filter(pair => nums.includes(target - pair.num));
    for (let i = 0; i < filtered.length; i++) {
        for (let j = i + 1; j < filtered.length; j++) {
            if (filtered[i].num + filtered[j].num === target) {
                return [filtered[i].index, filtered[j].index];
            }
        }
    }
}
