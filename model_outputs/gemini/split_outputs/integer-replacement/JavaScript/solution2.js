function integerReplacement(n) {
  const memo = {};
  const helper = (num) => {
    if (num === 1) return 0;
    if (memo[num]) return memo[num];
    if (num % 2 === 0) {
      memo[num] = 1 + helper(num / 2);
    } else {
      memo[num] = 1 + Math.min(helper(num + 1), helper(num - 1));
    }
    return memo[num];
  };
  return helper(n);
}
