    class Solution {
        public int integerReplacement(int n) {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(n);
            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int curr = queue.poll();
                    if (curr == 1) return level;
                    if (curr % 2 == 0) queue.offer(curr / 2);
                    else {
                        queue.offer(curr + 1);
                        queue.offer(curr - 1);
                    }
                }
                level++;
            }
            return -1; // Should not reach here
        }
    }
    