
//새벽에 풀다자서 졸리고 생각안남 -> 사실 핑계고 ㅈㄴ멍청해서 못품 ^^ 자고 인나서 다시 풀어야함.
//정확성 31.3% 

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
            if(x >= y)
            {
                answer = x;
            }
        }
        
        return answer;
    }
}
