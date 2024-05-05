   class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           return helper(buckets, minutesToDie, minutesToTest, 0);
       }

       private int helper(int buckets, int minutesToDie, int minutesToTest, int pigs) {
           if (Math.pow(minutesToTest / minutesToDie + 1, pigs) >= buckets) {
               return pigs;
           }
           return helper(buckets, minutesToDie, minutesToTest, pigs + 1);
       }
   }
   