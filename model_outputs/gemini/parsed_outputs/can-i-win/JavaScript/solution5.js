function canIWin(maxChoosableInteger, desiredTotal) {
  const nimSum = (a, b) => (a ^ b) % (maxChoosableInteger + 1);
  const winningPositions = new Set();

  for (let i = 1; i <= maxChoosableInteger; i++) {
    winningPositions.add(nimSum(desiredTotal, i));
  }

  return winningPositions.has(0);
}
