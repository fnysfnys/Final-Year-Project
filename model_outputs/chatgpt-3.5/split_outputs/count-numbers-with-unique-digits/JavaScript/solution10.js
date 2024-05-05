function* uniqueDigitCountGenerator() {
    let result = 10;
    yield 1;
    yield result;
    
    for (let i = 2; i <= 10; i++) {
        let uniqueDigits = 9;
        for (let j = 0; j < i - 1; j++) {
            uniqueDigits *= (9 - j);
        }
        result += uniqueDigits;
        yield result;
    }
}

var countNumbersWithUniqueDigits = function(n) {
    const generator = uniqueDigitCountGenerator();
    
    for (let i = 0; i <= n; i++) {
        const value = generator.next().value;
        if (i === n) return value;
    }
};
