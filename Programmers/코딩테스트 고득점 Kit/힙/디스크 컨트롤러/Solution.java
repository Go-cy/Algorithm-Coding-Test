import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        //우선시점순으로 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        //요소시간 짧은순으로 정렬
        PriorityQueue<int[]> _PriorityQueue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        int iIndex = 0;  //시점Index
        int now = 0;    //현재시점(작업종료 후 다음작업 시작시점)
        int count = 0;  //완료작업Count
        
        while(count < jobs.length){
            //1. 다음작업 시작 전에 들어온 놈들 우선순위 큐에 추가
            while (iIndex < jobs.length && jobs[iIndex][0] <= now){
                _PriorityQueue.add(jobs[iIndex++]);
            }
            //2. 1에서 추가된 것 빌때까지 현재시점 계산
            if(_PriorityQueue.isEmpty()){
                now = jobs[iIndex][0];
            }else{
                int[] tmp = _PriorityQueue.poll();
                now += tmp[1];
                answer += now - tmp[0];
                count++;
            }
        }
        
        return answer/jobs.length;
    }
}
