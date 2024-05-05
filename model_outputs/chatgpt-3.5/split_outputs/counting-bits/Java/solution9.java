import java.util.Arrays;
import java.util.stream.IntStream;

public int[] countBits(int n) {
    return IntStream.rangeClosed(0, n)
                    .parallel()
                    .map(i -> Integer.bitCount(i))
                    .toArray();
}
