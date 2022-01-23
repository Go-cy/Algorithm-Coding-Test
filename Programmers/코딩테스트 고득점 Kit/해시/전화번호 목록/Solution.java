//배열로 풀면 효율성 3, 4 탈락임 해시로 다시풀어야함,, 자소서 작성때문에 내일 마저 풀어야함..
// 찾다보니 String의 startsWith라는 함수가 있어서 이걸로 사용했더니 쉽게 풀림

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for (int i = 0; i < phone_book.length - 1; i++) 
            if (phone_book[i + 1].startsWith(phone_book[i])) 
                return false;
        
        return answer;
    }
}
