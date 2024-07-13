class Solution {
    public String solution(String my_string, int n) {
        //String answer = "";
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i < my_string.length() ; i++){
            char arr = my_string.charAt(i);
            answer.append(String.valueOf(arr).repeat(n));
        }
        
        
        return answer.toString();
    }
}