class SuperUglyHeap {
    int[] primes;
    int[] indices;
    int[] values;

    SuperUglyHeap(int[] primes) {
        this.primes = primes;
        this.indices = new int[primes.length];
        this.values = new int[primes.length];
        Arrays.fill(values, 1);
    }

    int poll() {
        int minVal = values[0];
        for (int i = 1; i < primes.length; i++) {
            if (values[i] < minVal) {
                minVal = values[i];
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (values[i] == minVal) {
                indices[i]++;
                values[i] = primes[i] * values[indices[i]];
            }
        }

        return minVal;
    }
}

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        SuperUglyHeap heap = new SuperUglyHeap(primes);
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = heap.poll();
        }

        return uglyNumbers[n - 1];
    }
}