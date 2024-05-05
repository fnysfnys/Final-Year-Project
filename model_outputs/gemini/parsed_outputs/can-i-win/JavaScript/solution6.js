function canIWin(maxChoosableInteger, desiredTotal) {
  const combinations = [];
  for (let i = 1; i <= maxChoosableInteger; i++) {
    combinations.push(i);
  }

  while (combinations.length) {
    const next = combinations.shift();
    if (next >= desiredTotal) return true;

    for (let i = 0; i < combinations.length; i++) {
      const newNum = next + combinations[i];
      if (newNum <= desiredTotal && !combinations.includes(newNum)) {
        combinations.push(newNum);
      }
    }
  }

  return false;
}
