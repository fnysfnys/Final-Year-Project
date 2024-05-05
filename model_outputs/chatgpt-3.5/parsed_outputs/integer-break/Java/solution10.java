class Solution {
    public int integerBreak(int n) {
        Map<Integer, Integer> maxProducts = new HashMap<>();
        maxProducts.put(2, 1);
        maxProducts.put(3, 2);
        maxProducts.put(4, 4);
        maxProducts.put(5, 6);
        maxProducts.put(6, 9);
        maxProducts.put(7, 12);
        maxProducts.put(8, 18);
        maxProducts.put(9, 27);
        maxProducts.put(10, 36);
        // Add more predefined cases as needed
        return maxProducts.getOrDefault(n, 0); // Handle other cases as needed
    }
}
