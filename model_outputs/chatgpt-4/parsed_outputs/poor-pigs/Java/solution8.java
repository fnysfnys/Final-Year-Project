class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           for (int pigs = 0; ; pigs++) {
               if (Math.pow(minutesToTest / minutesToDie + 1, pigs) >= buckets) {
                   return pigs;
               }
           }
       }
   }