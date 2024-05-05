function nthSuperUglyNumber(n, primes) {
  const pq = new PriorityQueue();
  pq.push({ num: 1, i: 0, j: 0 });
  const seen = new Set();
  for (let i = 0; i < n; i++) {
    const { num, i, j } = pq.pop();
    if (seen.has(num)) continue;
    seen.add(num);
    pq.push({ num: num * primes[i], i, j: j + 1 });
    if (i > 0) pq.push({ num: num * primes[j], i: i - 1, j });
  }
  return pq.top().num;
}
