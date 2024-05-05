var countDigitOne = n => Math.max(0, ...Array.from(String(n + 1)).map(Number)) * (n + 1);
