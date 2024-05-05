function countNumbersWithUniqueDigits(n) {
  let count = 0;
  const used = new Array(10).fill(false);

  function backtrack(position) {
    if (position === n) {
      count++;
      return;
    }
    for (let digit = 0; digit < 10; digit++) {
      if (!used[digit]) {
        used[digit] = true;
        backtrack(position + 1);
        used[digit] = false;
      }
    }
  }

  backtrack(0);
  return count;
}
