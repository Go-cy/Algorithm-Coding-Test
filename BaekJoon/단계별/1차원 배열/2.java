import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int location = 0;

        for(int i = 1; i <= 9; i ++){
            int temp = Integer.parseInt(br.readLine());
            if(max < temp){
                max = temp;
                location = i;
            }
        }
        bw.write(max + "\n" + location);

        br.close();
        bw.close();
    }
}
