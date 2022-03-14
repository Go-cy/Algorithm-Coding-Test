public class Main{
    public static void main(String[] args){
        boolean[] result = new boolean[10001];
        for(int i = 1; i < 10001; i++){
            int temp = selfnum(i);
            if( temp  <= 10000) result[temp] = true;
        }

        for(int i = 1; i < result.length; i++){
            if(!result[i]) System.out.println(i);
        }
    }

    public static int selfnum(int input){
        int temp = input;
        while(temp>0){
            input += temp%10;
            temp /= 10;
        }
        return input;
    }
}
