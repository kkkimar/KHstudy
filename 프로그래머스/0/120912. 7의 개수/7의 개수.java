class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array){
            String numStr = Integer.toString(num);
            for(int idx=0; idx<numStr.length();idx++){
                if(numStr.charAt(idx) == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}