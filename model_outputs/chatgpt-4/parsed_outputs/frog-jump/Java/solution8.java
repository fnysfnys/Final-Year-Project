class Solution {
        public boolean canCross(int[] stones) {
            Map<Integer, Set<Integer>> jumps = new HashMap<>();
            for (int stone : stones) {
                jumps.put(stone, new HashSet<>());
            }
            jumps.get(0).add(0);
            for (int stone : stones) {
                for (int jump : jumps.get(stone)) {
                    for (int k = jump - 1; k <= jump + 1; k++) {
                        if (k > 0 && jumps.containsKey(stone + k)) {
                            jumps.get(stone + k).add(k);
                        }
                    }
                }
            }
            return !jumps.get(stones[stones.length - 1]).isEmpty();
        }
    }