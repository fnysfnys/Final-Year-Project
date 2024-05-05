   class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int pigs = 0;
           while (Math.pow(minutesToTest / minutesToDie + 1, pigs) - 1 < buckets) {
               pigs++;
           }
           return pigs;
       }
   }
   