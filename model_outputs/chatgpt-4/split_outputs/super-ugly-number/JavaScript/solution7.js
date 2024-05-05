var nthSuperUglyNumber = function(n, primes) {
    let queues = primes.map(prime => [prime]);
    let ugly = 1;

    for (let i = 1; i < n; i++) {
        ugly = Math.min(...queues.map(q => q[0]));
        queues.forEach(queue => {
            if (queue[0] === ugly) {
                queue.shift();
                queue.push(ugly * primes[queues.indexOf(queue)]);
            }
        });
    }

    return ugly;
};
