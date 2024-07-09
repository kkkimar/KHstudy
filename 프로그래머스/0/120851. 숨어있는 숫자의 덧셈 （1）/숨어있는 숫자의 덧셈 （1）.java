class Solution {
    public int solution(String my_string) {
        // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        int sum = 0;

        // 숫자만 필터링하여 합산
        for(char c : charArray) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        // 합계 반환
        return sum;
    }
}

    
    