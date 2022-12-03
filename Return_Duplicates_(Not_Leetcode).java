public class Solution {
public String returnDuplicates(String my_input){

        List<Character> characterList = new ArrayList<>();
        for (int i=0; i < my_input.length(); i++){
            for (int j =i+1; j < my_input.length(); j++){
                if (my_input.charAt(i) == my_input.charAt(j) && !characterList.contains(my_input.charAt(i))){
                    characterList.add(my_input.charAt(i));
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character character: characterList){
            stringBuilder.append(character);
        }

        my_input = stringBuilder.toString();

        return my_input;
    }
}