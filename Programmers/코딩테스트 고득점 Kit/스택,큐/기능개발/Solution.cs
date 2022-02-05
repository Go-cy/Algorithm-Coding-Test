using System;
using System.Collections.Generic;
using System.Linq;

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
