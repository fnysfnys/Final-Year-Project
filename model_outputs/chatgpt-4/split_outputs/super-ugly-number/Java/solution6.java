import java.util.Arrays;

public int nthSuperUglyNumber(int n, int[] primes) {
    long left = 1, right = Integer.MAX_VALUE;
    while (left < right) {
        long mid = left + (right - left) / 2;
        if (!isUgly(mid, primes, n)) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return (int) left;
}

private boolean isUgly(long mid, int[] primes, int n) {
    int count = 0;
    for (int prime : primes) {
        long temp = mid;
        while (temp % prime == 0) {
            temp /= prime;
        }
        count

 += mid / temp;
    }
    return count >= n;
}
