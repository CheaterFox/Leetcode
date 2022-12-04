public class Solution {
public String returnDuplicates(String my_input){

        List<Character> characterList = new ArrayList<>();
        List<Character> duplicateList = new ArrayList<>();
        for (int i=0; i < my_input.length(); i++){
            if(!characterList.contains(my_input.charAt(i))){
                characterList.add(my_input.charAt(i));
            }
            else {
                if (!duplicateList.contains(my_input.charAt(i))){
                    duplicateList.add(my_input.charAt(i));
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character character: duplicateList){
            stringBuilder.append(character);
        }

        my_input = stringBuilder.toString();

        return my_input;
    }
}