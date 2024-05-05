var getMaxRepetitions = function(s1, n1, s2, n2) {
    let dp = Array(s1.length * n1).fill(0);

    for (let i = 0; i < s1.length * n1; i++) {
        for (let j = 0; j < s2.length * n2; j++) {
            if (s1[i % s1.length] === s2[j % s2.length]) {
                dp[i] = (i > 0 ? dp[i - 1] : 0) + 1;
            } else {
                dp[i] = i > 0 ? dp[i - 1] : 0;
            }
        }
    }

    return dp[s1.length * n1 - 1] / (s2.length * n2);
};
