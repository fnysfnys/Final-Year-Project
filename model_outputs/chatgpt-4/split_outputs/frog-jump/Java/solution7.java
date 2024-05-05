    class Solution {
        public boolean canCross(int[] stones) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0}); // position, jump
            Set<Integer> stoneSet = Arrays.stream(stones).boxed().collect(Collectors.toSet());
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                for (int i = -1; i <= 1; i++) {
                    int nextJump = current[1] + i;
                    if (nextJump > 0 && stoneSet.contains(current[0] + nextJump)) {
                        if (current[0] + nextJump == stones[stones.length - 1]) {
                            return true;
                        }
                        queue.offer(new int[]{current[0] + nextJump, nextJump});
                    }
                }
            }
            return false;
        }
    }
    