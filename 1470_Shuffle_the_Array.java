class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] shuffledNums = new int[nums.length];

        for(int i=0,j=0; i < (nums.length/2); i++,j+=2){
            shuffledNums[j] = nums[i];
            shuffledNums[j+1] = nums[i+n];
        }
        return shuffledNums;
    }
}