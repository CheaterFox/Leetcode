class Solution {
    public List<String> cellsInRange(String s) {

        char startColumn = s.charAt(0);
        char endColumn = s.charAt(3);

        int startRow = s.charAt(1) - '0';
        int endRow = s.charAt(4) - '0';
        
        List<String> list = new ArrayList<>();
        
        for (char a = startColumn; a <= endColumn; a++) {
            for (int i = startRow; i <= endRow; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a);
                stringBuilder.append(i);
                list.add(stringBuilder.toString());
            }
        }
        
        return list;
    }
}