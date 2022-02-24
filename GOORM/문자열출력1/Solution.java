public class Solution {
    public static void main(String[] args){
        String str = "happy-birthday";

        for( int i = 0; i <= 100; i++)
            System.out.println("i = " + i + " : " + solution(str, i));

    }

    public static String solution(String str, int sec){

        String answer = null;
        int remain = sec%28;

        if(remain < 14){    //0~13일경우 -문자가 뒷자리에 붙음
            answer = String.format("%14s",str.substring(0, remain));
        }else{              //13~일 경우 -문자가 앞자리에 붙음
            answer = String.format("%-14s", str.substring(remain-14, str.length()));
        }

        return answer.replace(' ', '_');
    }
}
