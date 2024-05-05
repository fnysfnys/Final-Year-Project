function canIWin(maxChoosableInteger, desiredTotal, memo = {}) {
  const key = `${desiredTotal}-${maxChoosableInteger}`;
  if (key in memo) return memo[key];

  for (let i = 1; i <= maxChoosableInteger; i++) {
    const remaining = desiredTotal - i;
    if (remaining <= 0 || !canIWin(maxChoosableInteger - 1, remaining, memo)) {
      memo[key] = true;
      return true;
    }
  }

  memo[key] = false;
  return false;
}
