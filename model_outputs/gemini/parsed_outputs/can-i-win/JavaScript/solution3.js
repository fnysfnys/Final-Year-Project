function canIWin(maxChoosableInteger, desiredTotal) {
  const mask = (1 << (maxChoosableInteger + 1)) - 1;
  let states = 1;

  for (let i = 1; i <= desiredTotal; i++) {
    const nextStates = states & ~(states << i);
    if (!nextStates) return false;
    states |= nextStates;
  }

  return true;
}
