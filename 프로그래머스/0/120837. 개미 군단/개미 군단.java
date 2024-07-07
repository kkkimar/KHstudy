class Solution {
    public int solution(int hp) {
        int answer = 0;
        //5,3,1
        answer = hp/5 + hp%5/3 + hp%5%3;
        return answer;
    }
}