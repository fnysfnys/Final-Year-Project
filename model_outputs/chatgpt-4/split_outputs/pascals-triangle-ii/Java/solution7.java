import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Function<Integer, Stream<Integer>> pascalRow = row -> Stream.iterate(new int[]{1, 1},
            p -> new int[]{p[1], p[1] * (row - p[0]) / (p[0] + 1)}).limit(row + 1).map(p -> p[0]);
        return pascalRow.apply(rowIndex).collect(Collectors.toList());
    }
}
