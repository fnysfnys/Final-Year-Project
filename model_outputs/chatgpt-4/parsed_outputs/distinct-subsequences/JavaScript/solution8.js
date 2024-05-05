function numDistinct(s, t) {
    let subsequences = [""];
    for (let char of s) {
        subsequences = subsequences.concat(subsequences.map(sub => sub + char));
    }
    return subsequences.filter(sub => sub === t).length;
}
