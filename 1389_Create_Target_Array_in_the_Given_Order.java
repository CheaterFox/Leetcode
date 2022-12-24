class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] target = new int[index.length];
        List<Integer> tempList = new ArrayList<>();

        for(int i = 0; i < index.length; i++) {
            tempList.add(index[i], nums[i]);
        }

        for(int i = 0; i < tempList.size(); i++) {
            target[i] = tempList.get(i);
        }
            
        return target;
    }
}