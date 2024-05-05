import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        pq.offer(new int[]{0, 1, -1}); // index, size, prev index

        int[] best = new int[]{0, 1, -1};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            if (current[1] > best[1]) {
                best = current;
            }

            for (int i = current[0] + 1; i < nums.length; i++) {
                if (nums[i] % nums[current[0]] == 0) {
                    pq.offer(new int[]{i, current[1] + 1, current[0]});
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = best[

[0]; i != -1; i = pq.stream().filter(e -> e[0] == i).findFirst().get()[2]) {
            result.add(nums[i]);
        }

        Collections.reverse(result);
        return result;
    }
}
