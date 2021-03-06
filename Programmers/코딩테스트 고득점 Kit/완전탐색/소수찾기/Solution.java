import java.util.ArrayList;

class Solution {
    
    // 소수의 갯수.
    static int answer = 0;
    // numbers의 몇 번째 인덱스에 방문했는지 여부를 체크하는 배열.
    static boolean[] check = new boolean[7];
    // numbers의 각 자리수로 만들 수 있는 조합을 저장 할 ArrayList.
    static ArrayList<Integer> arr = new ArrayList<>();
    
    public static void rec(String n,String temp,int len){
        // 11. 종료조건은 현재 만들고 있는 자릿수 == temp에 붙인 숫자의 길이 인경우. 
        if(temp.length() == len) {
            // 12. ArrayList에 이미 존재하는 값인지를 확인해 중복값 삽입을 방지.
            if(!arr.contains(Integer.parseInt(temp))) arr.add(Integer.parseInt(temp));              
            return;
        }
      
        // 4. n으로 전달 된 numbers를 탐색.
        for(int j =0;j<n.length();j++){
            // 5. 이미 방문한 인덱스면 패스.
            if(check[j]) continue;
            // 6. 임시 변수 temp에 붙여나가며 숫자를 조합.
            temp += n.charAt(j);
            // 7. temp에 붙였기 때문에 방문처리.
            check[j] = true;
            // 8. 재귀, 앞서 붙인 temp변수와 현재 몇 자리의 수를 만드는지에 대한 정보인 len 변수를 전달.
            rec(n,temp,len);
            // 9. 조합이 완료되면 직전의 방문처리한 인덱스를 false로 변경.
            check[j] = false;
            // 10. temp 변수에서 마지막 자리의 숫자를 제외하고 갱신.
            temp = temp.substring(0,temp.length()-1);

        }                      
    }
    
    //소수판별
    public static void cal(int n){        
        if(n == 0) return;
        if(n == 1) return;
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }
        
        answer++;
    }
        
    public int solution(String numbers) {
        String temp="";
      
        for(int i = 1;i<=numbers.length();i++)
            rec(numbers,temp,i);
      
        for(int x : arr)            
            cal(x);
        
        return answer;
    }
}
