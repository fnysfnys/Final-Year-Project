var integerReplacement = function(n) {
    let set = new Set([n]);
    let count = 0;
    while (!set.has(1)) {
        let nextSet = new Set();
        for (let num of set) {
            if (num % 2 === 0) nextSet.add(num / 2);
            else {
                nextSet.add(num + 1);
                nextSet.add(num - 1);
            }
        }
        set = nextSet;
        count++;
    }
    return count;
};
