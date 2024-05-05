var countDigitOne = function(n) {
    let count = 0;
    let factor = 1;
    
    while (n >= factor) {
        let currentDigit = Math.floor((n / factor) % 10);
        let higherDigits = Math.floor(n / (factor * 10));
        let lowerDigits = n % factor;
        
        if (currentDigit === 0) {
            count += higherDigits * factor;
        } else if (currentDigit === 1) {
            count += higherDigits * factor + lowerDigits + 1;
        } else {
            count += (higherDigits + 1) * factor;
        }
        
        factor *= 10;
    }
    
    return count;
};
