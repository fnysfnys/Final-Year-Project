function integerReplacement(n) {
  const queue = [[n, 0]];
  const seen = new Set([n]);
  while (queue.length) {
    const [num, steps] = queue.shift();
    if (num === 1) return steps;
    if (!seen.has(num / 2)) {
      queue.push([num / 2, steps + 1]);
      seen.add(num / 2);
    }
    if (num % 2 === 1) {
      if (!seen.has(num + 1)) {
        queue.push([num + 1, steps + 1]);
        seen.add(num + 1);
      }
      if (!seen.has(num - 1)) {
        queue.push([num - 1, steps + 1]);
        seen.add(num - 1);
      }
    }
  }
}
