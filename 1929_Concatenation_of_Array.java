class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[2*nums.length];
        int size1 = 0;
        for(int i=0; i < ans.length; i++){
            if(i != nums.length){
                ans[i] = nums[size1];
                size1++;
            }
            else{
                ans[i] = nums[0];
                size1 = 1;
            }
        }
        return ans;


    }
}