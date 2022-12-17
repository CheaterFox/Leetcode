class Solution {
    public int mostWordsFound(String[] sentences) {

        int count = 0;
        int temp = 0;

        for(int i = 0; i < sentences.length; i++){
            for (int j = 0; j< sentences[i].length(); j++){
                if (sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            if(temp < count){
                temp = count;
            }
            count = 0;
        }

        return (temp+1);
    }
}