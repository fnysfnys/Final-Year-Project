class Solution {
        public boolean canCross(int[] stones) {
            Map<Integer, Set<Integer>> stoneToSteps = new HashMap<>();
            for (int stone : stones) {
                stoneToSteps.put(stone, new HashSet<>());
            }
            stoneToSteps.get(0).add(0);

            for (int stone : stones) {
                for (int step : stoneToSteps.get(stone)) {
                    for (int i = -1; i <= 1; i++) {
                        int nextStep = step + i;
                        if (nextStep > 0 && stoneToSteps.containsKey(stone + nextStep)) {
                            stoneToSteps.get(stone + nextStep).add(nextStep);
                        }
                    }
                }
            }
            return !stoneToSteps.get(stones[stones.length - 1]).isEmpty();
        }
    }