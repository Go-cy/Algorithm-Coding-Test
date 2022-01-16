import java.util.Arrays;
import java.util.Comparator;

class Solution {
   public static String solution(int[] numbers) {
        String answer = "";
       
        String[] str = new String[numbers.length];
        
        for(int i = 0 ; i<str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
     // 내가 작성한 코드보다 뛰어난 코드가 있어서 해당 부분 대체함.
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String o1,String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        for(String arr : str)
            answer+=arr;
        
        if(str[0].equals("0")) answer = "0";
       
        return answer;
    }
}
