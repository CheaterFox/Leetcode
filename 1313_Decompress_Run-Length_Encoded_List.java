class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> tempList = new ArrayList<>();

        for(int i = 0; i < nums.length; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                tempList.add(nums[i+1]);
            }
        }
        
        int[] decompressed = new int[tempList.size()];

        for(int i = 0; i < tempList.size(); i++) {
            decompressed[i] = tempList.get(i);
        }

        return decompressed;
    }
}