import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] parts = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(String part : parts){
            if(part.equals("Z")){
                if(!stack.isEmpty()){
                    int lastNumber = stack.pop();
                    answer -= lastNumber;
                }
            }else{
                int num = Integer.parseInt(part);
                stack.push(num);
                answer+= num;
            }
        }
        
        
        return answer;
    }
}