//하,, 이딴 수학문제 좀 그만나왔으면 좋겠네 공식모르면 못푸는문제 씹

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0; i < clothes.length; i++)
        {
            map.put(clothes[i][1], null == map.get(clothes[i][1]) ? 1 : map.get(clothes[i][1]) + 1);
        }
        
        for(String key : map.keySet())
        {
        	answer *= map.get(key) + 1;
        }
        return answer - 1;
    }
}
