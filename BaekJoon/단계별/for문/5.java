import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int loopCnt = Integer.parseInt(br.readLine());

            for(int i = 0; i <loopCnt; i++){
                bw.write(i+"\n");
            }
            
            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
