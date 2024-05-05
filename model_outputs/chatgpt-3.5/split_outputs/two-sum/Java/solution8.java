public int[] twoSum(int[] nums, int target) {
    BitSet bitSet = new BitSet(2000000000); // Assuming the input range is within -109 to 109
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i] + 1000000000; // Offset to ensure non-negative indices
        if (bitSet.get(complement)) {
            return new int[] {i, complement - 1000000000}; // Revert the offset
        }
        bitSet.set(nums[i] + 1000000000); // Add offset
    }
    return null; // No valid solution found.
}
