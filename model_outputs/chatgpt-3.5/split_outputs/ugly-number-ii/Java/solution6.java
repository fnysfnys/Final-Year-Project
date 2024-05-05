import java.util.HashSet;
import java.util.Set;

public int nthUglyNumber(int n) {
    Set<Integer> uglySet = new HashSet<>();
    uglySet.add(1);
    int ugly = 1;

    while (n > 0) {
        ugly = uglySet.stream().min(Integer::compareTo).get();
        uglySet.remove(ugly);

        uglySet.add(ugly * 2);
        uglySet.add(ugly * 3);
        uglySet.add(ugly * 5);

        n--;
    }

    return ugly;
}
