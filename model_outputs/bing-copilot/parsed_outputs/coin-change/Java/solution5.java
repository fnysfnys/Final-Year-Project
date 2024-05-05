class Solution {
    public int coinChange(int[] coins, int amount) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(amount);
        visited.add(amount);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currAmount = queue.poll();
                if (currAmount == 0)
                    return level;
                for (int coin : coins) {
                    int nextAmount = currAmount - coin;
                    if (nextAmount >= 0 && !visited.contains(nextAmount)) {
                        queue.offer(nextAmount);
                        visited.add(nextAmount);
                    }
                }
            }
            level++;
        }

        return -1;
    }
}
