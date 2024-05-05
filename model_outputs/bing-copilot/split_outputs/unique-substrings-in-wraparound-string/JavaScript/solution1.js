/**
 * We define the string base to be the infinite wraparound string of "abcdefghijklmnopqrstuvwxyz", so base will look like this:
 * 
 * "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".
 * 
 * Given a string s, return the number of unique non-empty substrings of s that are present in base.
 *  
 * Example 1:
 * 
 * Input: s = "a"
 * Output: 1
 * Explanation: Only the substring "a" of s is in base.
 * 
 * Example 2:
 * 
 * Input: s = "cac"
 * Output: 2
 * Explanation: There are two substrings ("a", "c") of s in base.
 * 
 * Example 3:
 * 
 * Input: s = "zab"
 * Output: 6
 * Explanation: There are six substrings ("z", "a", "b", "za", "ab", and "zab") of s in base.
 * 
 *  
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * 
 * @param {string} s
 * @return {number}
 */
var findSubstringInWraproundString = function(s) {
    // Initialize an array to store the maximum length of substring ending at each character
    const maxLenEndingAt = new Array(26).fill(0);
    
    // Initialize the current length of substring
    let curLen = 0;
    
    // Iterate over each character in the string
    for (let i = 0; i < s.length; i++) {
        const curr = s.charCodeAt(i) - 'a'.charCodeAt(0);
        
        // If the current character can be added to the previous substring
        if (i > 0 && (s.charCodeAt(i - 1) !== (curr + 25) % 26 + 'a'.charCodeAt(0))) {
            curLen = 0;
        }
        
        // Update the current length of substring
        curLen++;
        
        // Update the maximum length ending at the current character
        maxLenEndingAt[curr] = Math.max(maxLenEndingAt[curr], curLen);
    }
    
    // Calculate the total count of unique non-empty substrings
    let ans = 0;
    for (const len of maxLenEndingAt) {
        ans += len;
    }
    
    return ans;
};

// Example usage:
console.log(findSubstringInWraproundString("zab")); // Output: 6
