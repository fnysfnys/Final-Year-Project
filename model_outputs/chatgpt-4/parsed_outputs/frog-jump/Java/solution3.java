class Solution {
        public boolean canCross(int[] stones) {
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{0, 0}); // position, jump distance
            Set<Integer> stonePositions = Arrays.stream(stones).boxed().collect(Collectors.toSet());
            while (!stack.isEmpty()) {
                int[] current = stack.pop();
                for (int jump = current[1] - 1; jump <= current[1] + 1; jump++) {
                    if (jump > 0 && stonePositions.contains(current[0] + jump)) {
                        if (current[0] + jump == stones[stones.length - 1]) {
                            return true;
                        }
                        stack.push(new int[]{current[0] + jump, jump});
                    }
                }
            }
            return false;
        }
    }