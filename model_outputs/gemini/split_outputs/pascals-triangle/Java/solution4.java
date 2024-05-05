public List<List<Integer>> generate(int numRows) {
    return IntStream.range(0, numRows)
            .mapToObj(row -> IntStream.rangeClosed(0, row)
                    .boxed()
                    .map(col -> col == 0 || col == row ? 1 : 0)
                    .collect(Collectors.toList()))
            .collect(Collectors.toList());
}
