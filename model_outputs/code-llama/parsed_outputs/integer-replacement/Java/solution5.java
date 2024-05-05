class Solution {
    public int integerReplacement(int n) {
       int low = 1, high = n;
       while (low <= high) {
           int mid = low + (high - low) / 2;
           if (mid % 2 == 0) {
               low = mid + 1;
           } else {
               high = mid - 1;
           }
       }
       return low;
    }
    
}
