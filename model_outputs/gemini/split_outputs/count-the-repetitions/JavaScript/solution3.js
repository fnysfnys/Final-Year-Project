function getMaxRepetitions(s1, n1, s2, n2) {
  const l1 = s1.length, l2 = s2.length;
  const next = buildNext(s2);

  let count = 0, i = 0, j = 0;

  while (count < n2 * l2) {
    if (j === l2) {
      count++;
      j = next[j - 1];
    } else if (s1[i] === s2[j]) {
      i++;
      j++;
    } else if (j > 0) {
      j = next[j - 1];
    } else {
      i++;
    }
  }

  return Math.floor(count / l2);

  function buildNext(s) {
    const l = s.length;
    const next = new Array(l).fill(-1);
    next[0] = 0;

    for (let i = 1; i < l; i++) {
      let j = next[i - 1];
      while (j !== -1 && s[i] !== s[j]) {
        j = next[j];
      }
      next[i] = j + 1;
    }

    return next;
  }
}
