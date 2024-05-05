function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  const digits = "0123456789".slice(0, n);
  let count = 0;
  for (const permutation of permutations(digits)) {
    if (new Set(permutation).size === permutation.length) {
      count++;
    }
  }
  return count;

  function permutations(remaining) {
    if (remaining.length === 1) return [remaining];
    const perms = [];
    for (let i = 0; i < remaining.length; i++) {
      const char = remaining[i];
      const rest = remaining.slice(0, i).concat(remaining.slice(i + 1));
      for (const perm of permutations(rest)) {
        perms.push(char + perm);
      }
    }
    return perms;
  }
}
