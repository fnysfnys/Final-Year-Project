class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(amount);
        visited.add(amount);
        
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                
                for (int coin : coins) {
                    int next = current - coin;
                    
                    if (next == 0) return level + 1;
                    if (next > 0 && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            
            level++;
        }
        
        return -1;
    }
}
