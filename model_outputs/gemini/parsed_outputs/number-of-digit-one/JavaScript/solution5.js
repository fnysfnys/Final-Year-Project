var countDigitOne = n => [...String(n + 1)].reduce((acc, c) => acc + Number(c), 0) * (n + 1);
