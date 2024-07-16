import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int degit : digits){
            answer += degit;
        }
        return answer;
    }
}