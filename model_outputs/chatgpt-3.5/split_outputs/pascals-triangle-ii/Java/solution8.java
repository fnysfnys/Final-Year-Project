import java.util.*;
import java.math.BigInteger;

public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    BigInteger value = BigInteger.valueOf(1);
    
    for (int i = 0; i <= rowIndex; i++) {
        row.add(value.intValue());
        value = value.multiply(BigInteger.valueOf(rowIndex - i)).divide(BigInteger.valueOf(i + 1));
    }
    
    return row;
}
