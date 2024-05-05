public boolean canCross(int[] stones) {
   int mid = stones.length / 2;
   int[] left = Arrays.copyOfRange(stones, 0, mid);
   int[] right = Arrays.copyOfRange(stones, mid, stones.length);
   return canCross(left) && canCross(right);
}
