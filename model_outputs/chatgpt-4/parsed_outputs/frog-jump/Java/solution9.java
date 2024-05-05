class Solution {
        public boolean canCross(int[] stones) {
            return canCrossRecursive(stones, 0, 0, new HashMap<>());
        }

        private boolean canCrossRecursive(int[] stones, int index, int lastJump, Map<String, Boolean> memo) {
            if (index == stones.length - 1) return true;
            String key = index + ":" + lastJump;
            if (memo.containsKey(key)) return memo.get(key);
            int nextIndex = Arrays.binarySearch(stones, index + 1, stones.length, stones[index] + lastJump);
            if (nextIndex > 0 && canCrossRecursive(stones, nextIndex, lastJump, memo)) {
                memo.put(key, true);
                return true;
            }
            memo.put(key, false);
            return false;
        }
    }