public List<Integer> getRow(int rowIndex) {
   if (rowIndex == 0) {
       return Arrays.asList(1);
   }
   List<Integer> row = new ArrayList<>();
   row.add(1);
   for (int i = 1; i <= rowIndex; i++) {
       row.add(row.get(i - 1) + row.get(i));
   }
   return row;
}
