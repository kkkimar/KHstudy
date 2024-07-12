import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answerList.add(numlist[i]);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}