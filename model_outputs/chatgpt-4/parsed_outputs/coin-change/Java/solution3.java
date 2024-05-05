class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        boolean[] visited = new boolean[amount + 1];
        visited[0] = true;
        int level = 0;
    
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == amount) return level;
                for (int coin : coins) {
                    int next = current + coin;
                    if (next <= amount && !visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
