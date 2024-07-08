import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiouAEIOU]","");
 
        return answer;
    }
}