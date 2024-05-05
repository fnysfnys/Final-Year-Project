   class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int attempts = minutesToTest / minutesToDie;
           return (int) Math.ceil(Math.log(buckets) / Math.log(attempts + 1));
       }
   }
   