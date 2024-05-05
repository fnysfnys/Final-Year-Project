    // Note: Requires Web Assembly (i32.popcnt)
    function countBits(num) {
        return WebAssembly.i32.popcnt(num);
    }
    