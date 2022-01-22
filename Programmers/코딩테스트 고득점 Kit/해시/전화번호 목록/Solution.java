//배열로 풀면 효율성 3, 4 탈락임 해시로 다시풀어야함,, 자소서 작성때문에 내일 마저 풀어야함..

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i = 0; i < phone_book.length; i++)
        {
            for( int j = 0; j < phone_book.length; j++)
            {
                if(i != j)
                {
                    if(phone_book[i].length() <= phone_book[j].length())
                    {
                        if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length())))
                            return false;
                    }
                }
            }
        }
        return answer;
    }
}
