class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int numsClone[] = nums.clone(); 
        Arrays.sort(nums);
       for(int i = 0 ; i < nums.length;i++) {
           if(!map.containsKey(nums[i])) {
               map.put(nums[i],i);
           }
            
        }
        int[] result = new int[nums.length];
        for(int i = 0 ; i < numsClone.length;i++) {
           result[i] = map.get(numsClone[i]); 
        }
        return result;
    }
}