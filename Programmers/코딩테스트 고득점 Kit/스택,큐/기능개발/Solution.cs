using System;
using System.Collections.Generic;
using System.Linq;

//.Net 6는 Linq 추가 안해도 가능한데 이전버전에선 반드시 추가해야하는듯,, 이것때문에 시간 개날림

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
     
        List<int> iList = new List<int>();
        while (iList.Sum() < progresses.Length)
        {
            int count = 0;
            for (int i = iList.Sum(); i < progresses.Length; i++) 
                progresses[i] += speeds[i];
 
            if (progresses[iList.Sum()] >= 100)
            {
                for (int i = iList.Sum(); i < progresses.Length; i++)
                {
                    if (progresses[i] >= 100) count++; 
                    else break;
                }
            }
 
            if (count != 0) iList.Add(count);
        }
        return iList.ToArray();
    }
}
