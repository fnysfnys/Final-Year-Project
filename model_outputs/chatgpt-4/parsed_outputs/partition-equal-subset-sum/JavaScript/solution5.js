var canPartition = function(nums) {
    let sum = nums.reduce((a, b) => a + b, 0);
    if (sum & 1) return false;
    
    let bitset = new Uint32Array((sum >> 5) + 1);
    bitset[0] = 1;
    
    for (let num of nums) {
        let copy = bitset.slice();
        for (let i = 0; i < bitset.length; i++) {
            bitset[i] |= copy[i] << num;
        }
    }

    return !!(bitset[sum >> 1] & (1 << ((sum >> 1) & 31)));
};