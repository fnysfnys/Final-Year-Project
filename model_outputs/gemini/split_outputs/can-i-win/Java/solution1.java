public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    boolean[] memo = new boolean[desiredTotal + 1];
    return canIWinRecursive(maxChoosableInteger, desiredTotal, memo);
}

private boolean canIWinRecursive(int maxChoosableInteger, int desiredTotal, boolean[] memo) {
    if (desiredTotal <= 0) {
        return false;
    }
    if (memo[desiredTotal]) {
        return true;
    }
    for (int i = 1; i <= maxChoosableInteger; i++) {
        if (!canIWinRecursive(maxChoosableInteger - 1, desiredTotal - i, memo)) {
            memo[desiredTotal] = true;
            return true;
        }
    }
    memo[desiredTotal] = false;
    return false;
}
