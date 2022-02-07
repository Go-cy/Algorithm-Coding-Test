
//효율성 실패
/*
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i<scoville.length; i++) {
            list.add(scoville[i]);
        }
        
        while(true)
        {
            if(list.size() == 1)
            {
                if(list.get(0) >= K)
                    break;
                else
                    return -1;
            }
        	if(Collections.min(list) >= K)
        	{
        		break;
        	}
        	int min1 = Collections.min(list);
        	list.remove(Integer.valueOf(Collections.min(list)));
        	int min2 = Collections.min(list);
        	list.remove(Integer.valueOf(Collections.min(list)));
        	list.add(Integer.valueOf(min1 + 2 * min2));
            answer++;
        }
        
        return answer;
    }
}
*/
