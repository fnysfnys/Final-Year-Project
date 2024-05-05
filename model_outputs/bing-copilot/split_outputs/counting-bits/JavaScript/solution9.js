    function countBits(num) {
        let count = 0;
        while (num) {
            num &= num - 1;
            count++;
        }
        return count;
    }
    