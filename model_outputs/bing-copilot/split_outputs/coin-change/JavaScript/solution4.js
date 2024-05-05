var coinChange = function(coins, amount) {
    const queue = [amount];
    const visited = new Set();
    let level = 0;
    while (queue.length > 0) {
        const size = queue.length;
        for (let i = 0; i < size; i++) {
            const curr = queue.shift();
            if (curr === 0) return level;
            for (const coin of coins) {
                const next = curr - coin;
                if (next >= 0 && !visited.has(next)) {
                    queue.push(next);
                    visited.add(next);
                }
            }
        }
        level++;
    }
    return -1;
};
