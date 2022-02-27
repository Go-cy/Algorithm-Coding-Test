class Solution {
    public String solution(String number, int k) {
        StringBuffer answer = new StringBuffer(number);
        int result = number.length() - k;

        int index = 0;
        while(answer.length() > result && index < answer.length() - 1){
            if(answer.charAt(index) < answer.charAt(index+1)){
                answer.deleteCharAt(index);
                //삭제 후 바로 앞자리부터 다시 비교
                if(index > 0)
                    index--;
            }
            else{
                index++;
            }
        }
        
        //뒷놈들 삭제
        while(answer.length() > result){
            answer.deleteCharAt(answer.length()-1);
        }
        
        return answer.toString();
    }
}
