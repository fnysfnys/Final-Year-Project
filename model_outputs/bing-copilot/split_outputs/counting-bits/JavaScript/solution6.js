    function count1(n, accumulator = 0) {
        if (n === 0) {
            return accumulator;
        }
        return count1(n / 2, accumulator + (n & 1));
    }
    