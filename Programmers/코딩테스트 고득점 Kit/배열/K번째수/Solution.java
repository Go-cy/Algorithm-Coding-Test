//설명 필요없을듯,,

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++)
        {
            int[] valueList = new int[commands[i][1] - commands[i][0] + 1];
            
            for (int j = 0; j < valueList.length; j++ )
            {
                valueList[j] = array[commands[i][0] -1 + j];                
            }
            
            Arrays.sort(valueList);
            
            answer[i] = valueList[commands[i][2]-1];
        }
        
        return answer;
        
    }
}
