class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] charArray = cipher.toCharArray();
        for(int i=0; i < charArray.length; i++){
            if((i+1)%code == 0){
                answer += charArray[i];
            }
        }
        return answer;
    }
}