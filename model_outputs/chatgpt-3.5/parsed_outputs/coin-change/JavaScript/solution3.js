var coinChange = function(coins, amount) {
    coins.sort((a, b) => b - a); // Sort in descending order
    let count = 0;

    for (const coin of coins) {
        while (amount >= coin) {
            amount -= coin;
            count++;
        }
    }

    return amount === 0 ? count : -1;
};