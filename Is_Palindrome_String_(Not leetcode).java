// This code looking for String which is palindorme or not
// Like xox = xox >> true , xoy = yox > false
public class Solution{
    public String restoreString(String s) {
        List<Character> characterList = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            characterList.add(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c: characterList){
            stringBuilder.append(c);
        }
        String s2 = stringBuilder.toString();
        if (s2.equals(s)){
            return "true";
        }
        else {
            return "false";
        }

    }
}