import java.util.ArrayList;
import java.util.List;

public int nthSuperUglyNumber(int n, int[] primes) {
    List<Integer> uglyNumbers = new ArrayList<>();
    uglyNumbers.add(1);
    int[] indices = new int[primes.length];

    while (uglyNumbers.size() < n) {
        int minUgly = Integer.MAX_VALUE;
        for (int i = 0; i < primes.length; i++) {
            minUgly = Math.min(minUgly, primes[i] * uglyNumbers.get(indices[i]));
        }
        uglyNumbers.add(minUgly);

        for (int i = 0; i < primes.length; i++) {
            if (minUgly == primes[i] * uglyNumbers.get(indices[i])) {
                indices[i]++;
            }
        }
    }

    return uglyNumbers.get(n - 1);
}
