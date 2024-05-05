function getMaxRepetitions(s1, n1, s2, n2) {
  const l1 = s1.length, l2 = s2.length;
  const dp = new Array(l1 * n1 + 1).fill(0);

  for (let i = 1; i <= l1 * n1; i++) {
    for (let j = 0; j < l2; j++) {
      if (s1[(i - 1) % l1] === s2[j]) {
        dp[i] = Math.max(dp[i], dp[(i - l1) % l1] + 1);
      }
    }
  }

  return Math.floor(dp[l1 * n1] / l2);
}
