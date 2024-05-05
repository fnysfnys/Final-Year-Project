import java.util.*;

public List<Integer> getRow(int rowIndex) {
    Queue<Integer> row = new LinkedList<>();
    for (int i = 0; i <= rowIndex; i++) {
        row.offer(1);
        for (int j = 1; j < i; j++) {
            int sum = row.poll() + row.peek();
            row.offer(sum);
        }
        if (i > 0) {
            row.offer(1);
        }
    }
    return new ArrayList<>(row);
}
