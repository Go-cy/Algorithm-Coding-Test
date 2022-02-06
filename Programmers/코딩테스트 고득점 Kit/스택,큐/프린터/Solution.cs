using System;
using System.Collections.Generic;
using System.Linq;

struct Priority
{
    //구조체 필드 이니셜라이즈는 C#10부터 가능함. ex)public int number = 0; 
    public int number;      // 프린터의 중요도
    public int location;    // 현재 순서를 저장할 변수

    public Priority(int _number, int _location)
    {
        number = _number;
        location = _location;
    }
}


public class Solution
{
    
    
    public int solution(int[] priorities, int location)
    {
        int answer = 0;

        Queue<Priority> priorties_queue = new Queue<Priority>();

        // 큐에 Priority 클래스의 정보에 맞게끔 순서 데이터를 추가하여 저장
        for(int i = 0; i < priorities.Length; ++i)
        {
            Priority temp_prior = new Priority(priorities[i], i);
            priorties_queue.Enqueue(temp_prior);
        }
        // 프린트 대기중인 큐가 없어질 때까지 반복
        while(priorties_queue.Count > 0)
        {
            // 현재 큐에서 가장 큰 수(우선순위)를 찾음
            int max_number = priorties_queue.ToArray().Max(x => x.number);

            // 큐에서 바로 다음 프린트 대기중인 데이터 가져옴
            Priority temp_queue = priorties_queue.Dequeue();

            // 우선순위가 가장 높을 경우 프린트함
            if (temp_queue.number >= max_number)
            {
                answer++;

                // 우선순위가 가장 높으면서 요청한 location일 경우 반복문 종료
                if (temp_queue.location == location)
                {
                    break;
                }
            }
            // 우선순위가 가장 높지않을 경우는 다시 큐의 맨 뒤로 보냄
            else
            {
                priorties_queue.Enqueue(temp_queue);
            }
        }

        return answer;
    }
}
