class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] orderArr = String.valueOf(order).toCharArray();
        for(int i=0; i < orderArr.length; i++){
            int num = Character.getNumericValue(orderArr[i]);
            if(num == 3||num ==6|| num==9 ){
                
                answer ++;
            }
        }
        return answer;
    }
}