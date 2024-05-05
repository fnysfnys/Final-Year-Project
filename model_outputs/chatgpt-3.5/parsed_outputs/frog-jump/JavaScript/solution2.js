/**
 * Dynamic programming approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const n = stones.length;
    const dp = Array(n).fill(false).map(() => Array(n).fill(false));
    dp[0][0] = true;
    
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            const gap = stones[i] - stones[j];
            if (gap <= i && dp[j][gap]) {
                dp[i][gap] = true;
                if (stones[i] === stones[n - 1]) {
                    return true;
                }
            }
        }
    }
    
    return false;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true