//Key Point : if(brown == 2*((square / i)-2) + 2*(i-2) + 4)

import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[] {3,3};
        
        int square = brown + yellow;
        double max = Math.sqrt(square);
        
        for( int i = 3; i <= (int)max; i++)
        {
            if(square % i == 0)
                if(i <= square / i )
                    if(brown == 2*((square / i)-2) + 2*(i-2) + 4)
                        answer = new int[] { square / i ,i};
        }
        
        return answer;
    }
}
