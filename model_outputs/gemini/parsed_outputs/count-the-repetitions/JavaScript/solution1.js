function getMaxRepetitions(s1, n1, s2, n2) {
  const l1 = s1.length, l2 = s2.length;
  let count = 0, i = 0, j = 0;

  while (count < n2 * l2) {
    if (s1[i] === s2[j]) {
      j++;
      if (j === l2) {
        count++;
        j = 0;
      }
    }
    i = (i + 1) % (l1 * n1);
  }

  return Math.floor(count / l2);
}
