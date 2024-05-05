import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        BigInteger num = BigInteger.ONE;
        for (int i = 0; i <= rowIndex; i++) {
            row.add(num.intValue());
            num = num.multiply(BigInteger.valueOf(rowIndex - i))
                     .divide(BigInteger.valueOf(i + 1));
        }
        return row;
    }
}