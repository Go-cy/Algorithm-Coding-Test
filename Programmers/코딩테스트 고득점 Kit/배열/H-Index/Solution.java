
//새벽에 풀어서 졸림 -> 사실 핑계고 ㅈㄴ멍청해서 못품 ^^ 자고 인나서 다시 풀어야함.
//최대인용편수 h는 작성논문의 length을 넘을 수 없을 것 같은데,,졸린데,, 9,11케이스 통과 실패,, 87.5% 자고 내일함.. 미비된 다른 조건 생각 필요.
// 9빼고 다 통과,, => 결국 더 쳐다보다 풀고잠 ^^ 역시 옛말대로 멍청하면 몸이 고생.

//1. 최대인용편수 h는 작성논문의 legnth 값을 넘을 수 없음
//2. 해당 조건 이용해 length만큼 h값 증가시키면서 돌리고 한번 더 for문으로 모든 항목 체크함.
//3. 작성논문은 1이상 -> for i = 1~length까지로 설정 - 카운팅 변수라 ArrayIndexOutOfBoundsException과 연관 없음([i]로 접근해서 작업 X).

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for (int i = 1; i <= citations.length; i++)
        {
            int x = 0;
            int y = 0;
            
            for (int j = 0; j < citations.length; j++)
            {
                if(citations[j] >= i)
                {
                    x++;  
                }
                else
                {
                    y++; 
                }
            }
            if(x >= y && x >= i)
                answer = i;
        }
        
        return answer;
    }
}
