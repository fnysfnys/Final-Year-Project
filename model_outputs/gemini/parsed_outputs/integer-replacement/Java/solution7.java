class Solution {
    public int integerReplacement(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                if (num == 1) {
                    return count;
                }
                if (num % 2 == 0) {
                    queue.add(num / 2);
                } else {
                    queue.add(num + 1);
                    queue.add(num - 1);
                }
            }
            count++;
        }
        return 0; // should never reach here
    }
    
}
