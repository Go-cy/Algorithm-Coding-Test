import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int a1=0, a2 =0, a3 =0;
        
        for(int i =0; i<answers.length; i++){
            if(p1[i%p1.length] == answers[i]) a1++;
            if(p2[i%p2.length] == answers[i]) a2++;
            if(p3[i%p3.length] == answers[i]) a3++;
        }
    
        int max = Math.max(Math.max(a1, a2),a3); 
    
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
        if(max == a1) arrayList.add(1); 
        if(max == a2) arrayList.add(2);
        if(max == a3) arrayList.add(3);
    
        return Arrays.stream(arrayList.toArray(new Integer[arrayList.size()])).mapToInt(i->i).toArray();
    }
}
