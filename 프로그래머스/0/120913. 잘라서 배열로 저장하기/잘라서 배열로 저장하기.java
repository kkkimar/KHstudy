import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> resultList = new ArrayList<>();
        
        int length = my_str.length();
        
        for(int i=0; i<length; i +=n){
            String part = my_str.substring(i,Math.min(i+n,length));
            resultList.add(part);
        }
        
        String[] resultArray = resultList.toArray(new String[0]);
        
        return resultArray;
    }
}