import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> solutionMap = new HashMap<>();
        for (int i = 0;  i < nums.length; i++){
            Integer solutionIndex = solutionMap.get(nums[i]);
            if (solutionIndex != null){
                return new int[]{i,solutionIndex};
            }
            solutionMap.put(target - nums[i], i);
        }
        return nums;
    }
}