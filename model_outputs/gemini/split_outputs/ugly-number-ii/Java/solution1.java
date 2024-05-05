public int nthUglyNumber(int n) {
  int count = 0, num = 1;
  while (count < n) {
    if (isUgly(num)) {
      count++;
    }
    num++;
  }
  return num - 1;
}

boolean isUgly(int num) {
  while (num % 2 == 0) {
    num /= 2;
  }
  while (num % 3 == 0) {
    num /= 3;
  }
  while (num % 5 == 0) {
    num /= 5;
  }
  return num == 1;
}
