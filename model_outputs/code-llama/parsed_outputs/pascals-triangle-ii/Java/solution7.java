class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> triangle = new ArrayList<>();
       for (int i = 0; i <= rowIndex; i++) {
           triangle.add((int) Math.pow(2, i) - 1 + (int) Math.pow(2, i - 1) - 1);
       }
       return triangle;
    }
    
}
