function countOneBits(num) {
        var count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    var countBits = function(n) {
        var ans = [];
        for (var i = 0; i <= n; i++) {
            ans.push(countOneBits(i));
        }
        return ans;
    };