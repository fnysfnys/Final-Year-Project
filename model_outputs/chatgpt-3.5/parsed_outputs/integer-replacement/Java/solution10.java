class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        while (n != 1) {
            if (n == 3) {
                n--;
            } else if (n % 4 == 1) {
                n--;
            } else if (n % 4 == 3) {
                n++;
            } else {
                n /= 2;
            }
            count++;
        }
        return count;
    }
}
