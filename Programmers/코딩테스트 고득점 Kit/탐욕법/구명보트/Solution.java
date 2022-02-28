import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        List<Integer> list = new ArrayList<>();
        for(int x : people) list.add(x);
        Collections.sort(list, Collections.reverseOrder());


        ArrayDeque<Integer> dq = new ArrayDeque<>(50000);
        for(int x : list) dq.add(x);

        int ans = 0;
        while(dq.isEmpty() == false) {
            if(dq.peekFirst() <= limit/2){  //젤 돼지놈이 보트절반이하 -> 모두 2명탑승가능
                ans += dq.size() / 2 + dq.size() % 2;
                break;
            }
            else if(dq.peekLast() > limit/2){   //젤 멸치놈이 보트절반초과 -> 모두 1명만 탑승가능
                ans += dq.size();
                break;
            }
            int weight = dq.pollFirst();
            if(dq.isEmpty() == false && weight + dq.peekLast() <= limit) { dq.pollLast(); }
            ans++;
        }

        return ans;
    }
}
