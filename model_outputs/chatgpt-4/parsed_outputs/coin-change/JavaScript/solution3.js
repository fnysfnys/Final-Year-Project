/**
 * ... [Docstring as provided]
 */
var coinChange = function(coins, amount) {
    const queue = [[0, 0]];
    const visited = new Set([0]);

    while (queue.length > 0) {
        const [currentAmount, steps] = queue.shift();

        if (currentAmount === amount) return steps;

        for (let coin of coins) {
            const nextAmount = currentAmount + coin;
            if (nextAmount <= amount && !visited.has(nextAmount)) {
                visited.add(nextAmount);
                queue.push([nextAmount, steps + 1]);
            }
        }
    }

    return -1;
};