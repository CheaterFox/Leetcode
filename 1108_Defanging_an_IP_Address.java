public class Solution {
    public String defangIPaddr(String address) {

        List<Character> newAddress = new ArrayList<>();

        for(int i=0; i < address.length(); i++){

            char a = '.';

            if(a == address.charAt(i)){
                newAddress.add('[');
                newAddress.add(address.charAt(i));
                newAddress.add(']');
                continue;
            }

            newAddress.add(address.charAt(i));

        }
        StringBuilder addressBuilder = new StringBuilder();
        for (Character character : newAddress) {
            addressBuilder.append(character);
        }
        address = addressBuilder.toString();
        return address;
    }
}