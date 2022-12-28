class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> list = new ArrayList<>();
        int space = 0;
        int fullBag = 0;

        for(int i = 0; i < rocks.length; i++) {
            space = capacity[i] - rocks[i];
            if(space == 0) {
                fullBag++;
            } else {
                list.add(space);
            }
            
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) > additionalRocks) {
                break;
            } else if(list.get(i) > 0) {
                fullBag++;
                additionalRocks -= list.get(i);
            } 
        }

        return fullBag;


    }
}