/**
 * @param {string} s
 * @return {string[]}
 */
var cellsInRange = function(s) {
    let alphaBets = 'abcdefghijklmnopqrstuvwxyz'.toUpperCase().split("");
    let splittedRC = s.split(":");
    let startPt = splittedRC[0];
    let endPt = splittedRC[1];
    let startIndex = alphaBets.findIndex((item) => item === startPt[0]);
    let endIndex = alphaBets.findIndex((item) => item === endPt[0]);
    let res = alphaBets.slice(startIndex, endIndex+1).map((item) => item + parseInt(startPt[1]));
    let startRowVal = parseInt(startPt[1]);
    let endRowVal =  parseInt(endPt[1]);
    if(endRowVal === startPt[1]) return res.sort((a,b) => a[0].localeCompare(b[0]));
    let arr = [];
    while(startRowVal !== endRowVal){
        alphaBets.slice(startIndex, endIndex+1).forEach((item) => {
            arr.push(item + (startRowVal + 1))
        });
        startRowVal += 1;
    }
    return res.concat(arr).sort((a,b) => a[0].localeCompare(b[0]))
};