class Solution {
    public int[] buildArray(int[] nums) {
        int[] new_nums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            new_nums[i] = nums[nums[i]];
        }
        return new_nums;
    }
}