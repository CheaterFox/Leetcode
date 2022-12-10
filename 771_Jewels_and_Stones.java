class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        List<Character> jewelsList = new ArrayList<>();
        int jewelCounter = 0;
        for(int i = 0; i < jewels.length(); i++){
            jewelsList.add(jewels.charAt(i));
        }
        for(int i = 0; i < stones.length(); i++){
            if(jewelsList.contains(stones.charAt(i))){
                jewelCounter++;
            }
        }
        return jewelCounter;

    }
}