public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
   int m = 0;
   for (int i = 0; i <= n1; i++) {
       for (int j = 0; j <= n2; j++) {
           if (s1.substring(0, i) + s2.substring(0, j) == s1 + s2) {
               m = Math.max(m, i + j);
               break;
           }
       }
   }
   return m;
}
