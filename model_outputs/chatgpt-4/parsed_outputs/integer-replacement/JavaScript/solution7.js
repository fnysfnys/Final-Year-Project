var integerReplacement = function(n) {
    let queue = [n];
    let level = 0;
    while (queue.length) {
        let size = queue.length;
        while (size--) {
            let num = queue.shift();
            if (num === 1) return level;
            if (num % 2 === 0) queue.push(num / 2);
            else {
                queue.push(num + 1);
                queue.push(num - 1);
            }
        }
        level++;
    }
};