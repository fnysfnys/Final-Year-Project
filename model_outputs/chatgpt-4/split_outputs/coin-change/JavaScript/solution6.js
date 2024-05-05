/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    if (amount === 0) return 0;
    const queue = [[0, 0]];
    const seen = new Set();

    while (queue.length) {
        const [sum, count] = queue.shift();
        if (sum === amount) return count;

        for (let coin of coins) {
            const nextSum = sum + coin;
            if (nextSum <= amount && !seen.has(nextSum)) {
                seen.add

(nextSum);
                queue.push([nextSum, count + 1]);
            }
        }
    }

    return -1;
};
