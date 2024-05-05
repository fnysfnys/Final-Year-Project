class Solution {
        public boolean canCross(int[] stones) {
            return canCrossRecursive(stones, 0, 0, new HashMap<>());
        }

        private boolean canCrossRecursive(int[] stones, int index, int lastJump, Map<String, Boolean> memo) {
            if (index == stones.length - 1) return true;
            String key = index + ":" + lastJump;
            if (memo.containsKey(key)) return memo.get(key);

            for (int i = index + 1; i < stones.length; i++) {
                int gap = stones[i] - stones[index];
                if (gap > lastJump + 1) break; // early termination
                if (gap >= lastJump - 1) {
                    if (canCrossRecursive(stones, i, gap, memo)) {
                        memo.put(key, true);
                        return true;
                    }
                }
            }
            memo.put(key, false);
            return false;
        }
    }