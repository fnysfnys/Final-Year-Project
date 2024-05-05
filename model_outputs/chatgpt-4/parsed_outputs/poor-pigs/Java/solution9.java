class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int pigs = 0;
           while (combinations(minutesToTest / minutesToDie + 1, pigs) < buckets) {
               pigs++;
           }
           return pigs;
       }

       private int combinations(int n, int k) {
           int result = 1;
           for (int i = 1; i <= k; i++) {
               result *= n - i + 1;
               result /= i;
           }
           return result;
       }
   }