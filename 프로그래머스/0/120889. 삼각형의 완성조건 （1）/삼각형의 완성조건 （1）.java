import java.util.Arrays;  // Arrays 클래스를 사용하기 위한 import 구문

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int longest = sides[2];
        int sumOfOthers = sides[0] + sides[1];
        if(longest>=sumOfOthers){
          answer = 2;  
        } 
        else {
          answer = 1;  
        } 
        return answer;
    }
}