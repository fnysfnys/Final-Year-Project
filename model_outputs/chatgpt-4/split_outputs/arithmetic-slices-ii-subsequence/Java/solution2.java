import java.util.HashMap;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer>[] map = new HashMap[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
                int dif = (int) diff;
                int count = map[j].getOrDefault(dif, 0);
                int origin = map[i].getOrDefault(dif, 0);
                res += count;
                map[i].put(dif, origin + count + 1);
            }
        }
        return res;
    }
}
