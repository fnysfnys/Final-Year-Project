    function bitCount(n) {
        let bits = 0;
        while (n !== 0) {
            bits += bitCount32(n | 0);
            n /= 0x100000000;
        }
        return bits;
    }

    function bitCount32(n) {
        n = n - ((n >> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >> 2) & 0x33333333);
        return ((n + (n >> 4) & 0xF0F0F0F) * 0x1010101) >> 24;
    }
    