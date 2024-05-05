var nthSuperUglyNumber = function(n, primes) {
    const uglyNumbers = [1];
    
    function generateUglyNumber(index) {
        if (uglyNumbers.length >= n) {
            return;
        }
        
        let minVal = Number.MAX_SAFE_INTEGER;
        
        for (let prime of primes) {
            for (let num of uglyNumbers) {
                let nextUgly = prime * num;
                if (nextUgly > uglyNumbers[uglyNumbers.length - 1]) {
                    minVal = Math.min(minVal, nextUgly);
                }
            }
        }
        
        uglyNumbers.push(minVal);
        generateUglyNumber(index + 1);
    }
    
    generateUglyNumber(1);
    
    return uglyNumbers[n - 1];
};
