//배열로 푼 풀이
// java에서 String은 == 으로 비교하면 안됨.. 이걸 왜 안되게 해놨는지 ,,
// String 에서 == 은 객체가 같은지를 비교하지 가지고 있는 문자열을 비교하진 않는다.
// equals()는 C#과 같이 모든 객체의 부모클래스에서 object 형식으로 구현되어 있어 동일하게 사용 가능할듯
// 해쉬풀이는 하단에 추가로 풀었음.

import java.util.Arrays;
import java.util.Objects;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < participant.length; i++)
        {
            if(i == participant.length -1)
            {
                answer = participant[i+1];
                break;
            }
            if(!Objects.equals(participant[i],completion[i]))
            {
                answer = participant[i];
                break;
            }
        }
       
        return answer;
    }
}


// 해쉬 풀이
// getOrDefault(Object key, V DefaultValue)
// 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 반환

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
