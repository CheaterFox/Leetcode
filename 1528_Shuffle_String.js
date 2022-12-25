/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    let restore = new Array(s.length);
    for (let i = 0; i < s.length; i++) {
        res[indices[i]] = s[i];
    }
    
    return restore.join('');
};