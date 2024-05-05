import java.util.TreeSet;

public int nthUglyNumber(int n) {
    TreeSet<Integer> uglySet = new TreeSet<>();
    uglySet.add(1);

    while (n > 1) {
        int smallest = uglySet.pollFirst();
        uglySet.add(smallest * 2);
        uglySet.add(smallest * 3);
        uglySet.add(smallest * 5);
        n--;
    }

    return uglySet.first();
}
