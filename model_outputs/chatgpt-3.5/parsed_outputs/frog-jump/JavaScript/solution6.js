/**
 * Top-down recursive approach with memoization to check if the frog can cross the river.
 */
function canCross(stones) {
    const n = stones.length;
    const memo = {};
    
    function dfs(index, jumpSize) {
        if (index === n - 1) {
            return true;
        }
        if (memo[index] && memo[index][jumpSize] !== undefined) {
            return memo[index][jumpSize];
        }
        
        for (let i = index + 1; i < n; i++) {
            const gap = stones[i] - stones[index];
            if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
                if (dfs(i, gap)) {
                    if (!memo[index]) {
                        memo[index] = {};
                    }
                    memo[index][jumpSize] = true;
                    return true;
                }
            }
            if (gap > jumpSize + 1) {
                break;
            }
        }
        
        if (!memo[index]) {
            memo[index] = {};
        }
        memo[index][jumpSize] = false;
        return false;
    }
    
    return dfs(0, 0);
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true