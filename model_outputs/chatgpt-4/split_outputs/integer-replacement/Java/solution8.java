import java.math.BigInteger;

class Solution {
    public int integerReplacement(int n) {
        BigInteger num = BigInteger.valueOf(n);
        int count = 0;
        while (!num.equals(BigInteger.ONE)) {
            if (num.testBit(0)) {
                if (num.equals(new BigInteger("3")) || !num.testBit(1)) {
                    num = num.subtract(BigInteger.ONE);
                } else {
                    num = num.add(BigInteger.ONE);
                }
            } else {
                num = num.shiftRight(1);
            }
            count++;
        }
        return count;
    }
}
