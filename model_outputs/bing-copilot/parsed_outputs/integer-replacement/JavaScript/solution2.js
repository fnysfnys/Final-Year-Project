var integerReplacement = function(n) {
    const memo = new Map();
    const helper = (num) => {
        if (num === 1) return 0;
        if (memo.has(num)) return memo.get(num);
        let steps;
        if (num % 2 === 0) {
            steps = 1 + helper(num / 2);
        } else {
            steps = 1 + Math.min(helper(num + 1), helper(num - 1));
        }
        memo.set(num, steps);
        return steps;
    };
    return helper(n);
};
