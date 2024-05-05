public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
  int left = 0, right = (int) Math.ceil(Math.log(buckets) / Math.log(minutesToDie + 1));
  while (left < right) {
    int mid = left + (right - left) / 2;
    int possibleOutcomes = (int) Math.pow(minutesToDie + 1, mid);
    if (possibleOutcomes >= buckets) {
      right = mid;
    } else {
      left = mid + 1;
    }
  }
  return left;
}
