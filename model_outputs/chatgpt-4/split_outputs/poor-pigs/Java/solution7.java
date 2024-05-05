   class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int pigs = 0;
           while ((1 << (minutesToTest / minutesToDie * pigs)) < buckets) {
               pigs++;
           }
           return pigs;
       }
   }
   