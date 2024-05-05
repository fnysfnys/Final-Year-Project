class SegmentTree {
    constructor(nums) {
        this.tree = new Array(4 * nums.length).fill(0);
        this.buildTree(nums, 0, 0, nums.length - 1);
    }

    buildTree(nums, idx, left, right) {
        if (left === right) {
            this.tree[idx] = nums[left];
            return;
        }
        const mid = Math.floor((left + right) / 2);
        this.buildTree(nums, 2 * idx + 1, left, mid);
        this.buildTree(nums, 2 * idx + 2, mid + 1, right);
        this.tree[idx] = Math.max(this.tree[2 * idx + 1], this.tree[2 * idx + 2]);
    }

    query(idx, left, right, qLeft, qRight) {
        if (qLeft > right || qRight < left) return 0;
        if (qLeft <= left && qRight >= right) return this.tree[idx];
        const mid = Math.floor((left + right) / 2);
        return Math.max(
            this.query(2 * idx + 1, left, mid, qLeft, qRight),
            this.query(2 * idx + 2, mid + 1, right, qLeft, qRight)
        );
    }
}

var lengthOfLIS = function(nums) {
    const segTree = new SegmentTree(nums);
    const dp = new Array(nums.length).fill(1);
    for (let i = 1; i < nums.length; i++) {
        dp[i] = 1 + segTree.query(0, 0, nums.length - 1, 0, i - 1);
        segTree.update(i, dp[i]);
    }
    return Math.max(...dp);
};
