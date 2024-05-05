public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    if (numRows == 0) return triangle;
    triangle.add(Arrays.asList(1));
    for (int i = 1; i < numRows; i++) {
        List<Integer> prevRow = triangle.get(i - 1);
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        Deque<Integer> queue = new LinkedList<>(prevRow);
        while (!queue.isEmpty()) {
            int sum = newRow.get(newRow.size() - 1) + queue.poll();
            newRow.add(sum);
        }
        newRow.add(1);
        triangle.add(newRow);
    }
    return triangle;
}
