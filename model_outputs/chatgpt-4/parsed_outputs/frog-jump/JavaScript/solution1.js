var canCross = function(stones, position = 0, jump = 0, memo = {}) {
    let key = position + ',' + jump;
    if (key in memo) return memo[key];
    if (position === stones.length - 1) return true;
    for (let i = position + 1; i < stones.length; i++) {
        let gap = stones[i] - stones[position];
        if (gap >= jump - 1 && gap <= jump + 1) {
            if (canCross(stones, i, gap, memo)) {
                memo[key] = true;
                return true;
            }
        }
    }
    memo[key] = false;
    return false;
};