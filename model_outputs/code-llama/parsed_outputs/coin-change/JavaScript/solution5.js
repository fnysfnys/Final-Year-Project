function coinChange(coins, amount) {
   let hash = {};
   for (let i = 0; i < coins.length; i++) {
       hash[coins[i]] = 0;
   }
   for (let i = 1; i <= amount; i++) {
       for (let j = 0; j < coins.length; j++) {
           if (i >= coins[j]) {
               hash[i] = Math.min(hash[i], hash[i - coins[j]] + 1);
           }
       }
   }
   return hash[amount] === Infinity ? -1 : hash[amount];
}
