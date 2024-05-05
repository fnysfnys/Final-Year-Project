class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
       // Initialize a 2D array to store the results of subproblems
       boolean[][] dp = new boolean[maxChoosableInteger + 1][desiredTotal + 1];
    
       // Initialize the first row of the 2D array
       for (int i = 0; i <= maxChoosableInteger; i++) {
           dp[i][0] = true;
       }
    
       // Solve the subproblems
       for (int i = 1; i <= maxChoosableInteger; i++) {
           for (int j = 1; j <= desiredTotal; j++) {
               if (j >= i) {
                   dp[i][j] = dp[i - 1][j - i];
               } else {
                   dp[i][j] = false;
               }
           }
       }
    
       // Return the result of the last subproblem
       return dp[maxChoosableInteger][desiredTotal];
    }
    
}
