var coinChange = function(coins, amount) {
    const queue = [{ amount: amount, count: 0 }];

    while (queue.length > 0) {
        const { amount, count } = queue.shift();

        if (amount === 0) {
            return count;
        }

        for (const coin of coins) {
            if (amount - coin >= 0) {
                queue.push({ amount: amount - coin, count: count + 1 });
            }
        }
    }

    return -1;
};
