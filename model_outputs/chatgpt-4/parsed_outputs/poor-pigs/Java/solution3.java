class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int left = 0, right = buckets;
           while (left < right) {
               int mid = left + (right - left) / 2;
               if (Math.pow(minutesToTest / minutesToDie + 1, mid) < buckets) {
                   left = mid + 1;
               } else {
                   right = mid;
               }
           }
           return left;
       }
   }