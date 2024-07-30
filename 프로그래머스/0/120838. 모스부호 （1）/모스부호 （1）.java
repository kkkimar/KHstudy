import java.util.*;

class Solution {
    public String solution(String letter) {
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder answer = new StringBuilder();
        
        // 영어 알파벳에 대응하는 모스 부호 배열
        String mos[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 모스 부호와 영어 소문자를 매핑하는 HashMap 생성
        Map<String, Character> morse = new HashMap<>();
        char letterChar = 'a'; // 영어 소문자 'a'부터 시작
        for (String code : mos) {
            morse.put(code, letterChar);
            letterChar++;
        }
        
        // 주어진 편지를 공백을 기준으로 나누어 배열에 저장
        String let[] = letter.split(" ");
        
        // 각 모스 부호를 영어 소문자로 변환하여 StringBuilder에 추가
        for (String code : let) {
            answer.append(morse.get(code));
        }
        
        // 변환된 문자열을 문자열 형태로 반환
        return answer.toString();
    }
}
