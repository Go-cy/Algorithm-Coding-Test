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





//------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int count = 0;
        int result = number;
        do {
            result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
            count++;
        } while (number != result);

        System.out.println(count);
    }
}
