import java.util.stream.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input = Integer.parseInt(br.readLine());
            int last = (input/10 + input%10)%10;
            int first = input%10;
            int now = first*10+last;
            int cnt = 1;

            while(true){
                if(input == now) break;
                cnt++;
                first = now%10;
                last = (now/10 + now%10)%10;
                now = first*10+last;
            }

            bw.write(cnt+"\n");

            br.close();
            bw.close();
        }
        catch(IOException e){
            
        }
    }
}
