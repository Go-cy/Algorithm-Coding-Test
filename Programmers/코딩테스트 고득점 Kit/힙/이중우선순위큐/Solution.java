// lv3인데 개쉽네,,
import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        
        PriorityQueue<Integer> _MinPriorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> _MaxPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String str : operations){
            switch(str.charAt(0)){
                case 'I':{
                    _MaxPriorityQueue.add(Integer.parseInt(str.substring(2)));
                    _MinPriorityQueue.add(Integer.parseInt(str.substring(2)));
                }
                break;
                case 'D':{
                    if(Objects.equals(str.charAt(2),'-')){
                        _MaxPriorityQueue.remove(_MinPriorityQueue.poll());
                    }
                    else{
                        _MinPriorityQueue.remove(_MaxPriorityQueue.poll());
                    }
                }
                break;
            }
        }
        if(_MaxPriorityQueue.size() > 0)
            answer = new int[] {_MaxPriorityQueue.poll(),_MinPriorityQueue.poll()};
        else
            answer = new int[] {0, 0};
        return answer;
    }
}
