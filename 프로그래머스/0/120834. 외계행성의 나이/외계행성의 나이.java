class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = Integer.toString(age);
        for(char digit : ageStr.toCharArray()){
            answer.append((char)('a'+(digit-'0')));
        }
        
        return answer.toString();
    }
}