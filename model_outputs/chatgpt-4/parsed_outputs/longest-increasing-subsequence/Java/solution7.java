class Solution {
    public int lengthOfLIS(int[] nums) {
        // Assuming nums are all positive and within a known range, for simplicity
        int maxVal = 10000; // Adjust as per the range of nums
        int[] tree = new int[maxVal * 4];
        for (int num : nums) {
            int val = query(tree, 0, 0, maxVal, 0, num - 1) + 1;
            update(tree, 0, 0, maxVal, num, val);
        }
        return tree[0];
    }
    
    private void update(int[] tree, int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = Math.max(tree[node], val);
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) {
            update(tree, 2 * node + 1, start, mid, idx, val);
        } else {
            update(tree, 2 * node + 2, mid + 1, end, idx, val);
        }
        tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
    }
    
    private int query(int[] tree, int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        return Math.max(query(tree, 2 * node + 1, start, mid, l, r),
                        query(tree, 2 * node + 2, mid + 1, end, l, r));
    }
}
