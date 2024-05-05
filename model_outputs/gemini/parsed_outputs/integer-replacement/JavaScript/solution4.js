function integerReplacement(n) {
  const seen = new Set();
  const dfs = (num, steps) => {
    if (num === 1) return steps;
    if (seen.has(num)) return;
    seen.add(num);
    if (num % 2 === 0) {
      steps = dfs(num / 2, steps + 1);
    } else {
      steps = Math.min(dfs(num + 1, steps + 1), dfs(num - 1, steps + 1));
    }
    return steps;
  };
  return dfs(n, 0);
}
