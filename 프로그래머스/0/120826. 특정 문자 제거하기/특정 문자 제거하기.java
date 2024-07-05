import java.util.Arrays;
import java.util.stream.Collectors;


class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.chars()
                        .filter(ch-> ch != letter.charAt(0))
                        .mapToObj(c-> String.valueOf((char)c))
                        .collect(Collectors.joining());
        return answer;
    }
}