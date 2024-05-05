class Solution {
    public int lengthOfLIS(int[] nums) {
       Graph graph = new Graph(nums.length);
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[j] > nums[i]) {
                   graph.addEdge(i, j);
               }
           }
       }
       return graph.size();
    }
    
}
