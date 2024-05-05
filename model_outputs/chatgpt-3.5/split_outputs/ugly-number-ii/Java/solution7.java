import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public int nthUglyNumber(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1;

    List<Integer> uglyNumbers = new ArrayList<>();
    uglyNumbers.add(1);
    int index2 = 0, index3 = 0, index5 = 0;

    while (uglyNumbers.size() < n) {
        int nextUgly = Math.min(uglyNumbers.get(index2) * 2, Math.min(uglyNumbers.get(index3) * 3, uglyNumbers.get(index5) * 5));
        uglyNumbers.add(nextUgly);

        if (nextUgly == uglyNumbers.get(index2) * 2) index2++;
        if (nextUgly == uglyNumbers.get(index3) * 3) index3++;
        if (nextUgly == uglyNumbers.get(index5) * 5) index5++;
    }

    return uglyNumbers.get(n - 1);
}
