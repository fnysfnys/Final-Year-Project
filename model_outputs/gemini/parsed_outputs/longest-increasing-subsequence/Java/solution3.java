class Solution {
    public int lengthOfLIS(int[] nums) {
      int n = nums.length;
      int[] tails = new int[n]; // Array to store the ends of increasing subsequences
      int length = 0;
    
      for (int num : nums) {
        int i = binarySearch(tails, length, num);
    
        // Replace the end of the subsequence if larger than current end
        if (i < length) {
          tails[i] = num;
        } else {
          // Create a new subsequence with this number
          tails[length] = num;
          length++;
        }
      }
    
      return length;
    }
    
    private int binarySearch(int[] arr, int len, int num) {
      int low = 0;
      int high = len - 1;
    
      while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == num) {
          return mid;
        } else if (arr[mid] < num) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    
      return low;
    }
    
}
