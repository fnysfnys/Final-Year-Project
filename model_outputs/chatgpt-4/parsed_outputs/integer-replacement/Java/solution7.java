class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        while (n != 1) {
            if ((n & 3) == 3 && n != 3) {
                n++;
            } else if ((n & 1) == 1) {
                n--;
            } else {
                n >>>= 1;
            }
            count++;
        }
        return count;
    }
}