class Solution {
    public String restoreString(String s, int[] indices) {

        Map<Integer,Character> stringWithIndices = new HashMap<>();
        List<Character> orderedList = new ArrayList<>();
        for (int i=0; i < s.length(); i++){
            stringWithIndices.put(indices[i],s.charAt(i));
        }
        for (int i=0; i < s.length(); i++){
            orderedList.add(stringWithIndices.get(i));
        }

        StringBuilder orderedBuilder = new StringBuilder();
        for (Character character : orderedList) {
            orderedBuilder.append(character);
        }

        s = orderedBuilder.toString();

        return s;
    }
}