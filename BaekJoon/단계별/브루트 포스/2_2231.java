import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        br.close();
        int result = 0;
        int start = input - 9 * ((int)(Math.log10(input)+1));

        for(int i = start; i < input; i++){
            int temp = i;
            int now = i;
            while(now > 0){
                temp += now%10;
                now /= 10;
            }
            if(temp == input){
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
