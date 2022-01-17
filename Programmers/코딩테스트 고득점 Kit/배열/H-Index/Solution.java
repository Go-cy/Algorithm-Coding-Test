
//새벽에 풀다자서 졸리고 생각안남 -> 사실 핑계고 ㅈㄴ멍청해서 못품 ^^ 자고 인나서 다시 풀어야함.
//정확성 31.3% 
//최대인용편수 h는 작성논문의 length을 넘을 수 없을 것 같은데,,졸린데,, 아 ! x랑 h[i]값이랑 같아야한다 ㅎㅎ 생각남
// 하 9,11케이스 통과 실패,, 87.5% 자고 내일함.. 미비된 다른 조건 생각 필요.

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] h = new int[citations.length];
        
        for (int i = 0; i < citations.length; i++)
        {
            h[i] = i;
            int x = 0;
            int y = 0;
            
            for (int j = 0; j < citations.length; j++)
            {
                if(citations[j] >= h[i])
                {
                    x++;  
                }
                else
                {
                    y++; 
                }
            }
            if(x >= y && h[i] == x)
            {
                answer = x;
            }
        }
        
        return answer;
    }
}
