class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> triangle = new ArrayList<>();
       triangle.add(1);
       for (int i = 1; i <= rowIndex; i++) {
           triangle.add(triangle.get(i - 1) + triangle.get(i));
       }
       return triangle;
    }
    
}
