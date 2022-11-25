import java.util.HashMap;
public class Solution {

        public int romanToInt(String s) {

            HashMap<Character,Integer> romanNumbers = new HashMap<>();

            romanNumbers.put('I',1);
            romanNumbers.put('V',5);
            romanNumbers.put('X',10);
            romanNumbers.put('L',50);
            romanNumbers.put('C',100);
            romanNumbers.put('D',500);
            romanNumbers.put('M',1000);

            int ret = 0;
            for (int i = 0; i < s.length(); i++){
                if (i+1 == s.length()){
                    ret += romanNumbers.get(s.charAt(i));
                } else if (romanNumbers.get(s.charAt(i+1)) > romanNumbers.get(s.charAt(i))){
                    ret += romanNumbers.get(s.charAt(i+1)) - romanNumbers.get(s.charAt(i));
                    i++;
                } else {
                    ret += romanNumbers.get(s.charAt(i));
                }
            }
            return ret;
        }
}