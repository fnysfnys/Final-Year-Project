function canIWin(maxChoosableInteger, desiredTotal, alpha = -Infinity, beta = Infinity) {
  for (let i = 1; i <= maxChoosableInteger; i++) {
    const remaining = desiredTotal - i;
    if (remaining <= 0 || !canIWin(maxChoosableInteger - 1, remaining, alpha, beta)) {
      return true;
    }
    alpha = Math.max(alpha, remaining);
  }

  return false;
}
