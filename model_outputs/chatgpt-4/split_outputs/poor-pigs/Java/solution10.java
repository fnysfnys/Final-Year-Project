    class Solution {
        /**
         * (Docstring as provided)
         */
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            int tests = minutesToTest / minutesToDie;
            int base = tests + 1;
            return (int) Math.ceil(Math.log(buckets) / Math.log(base));
        }
    }
    