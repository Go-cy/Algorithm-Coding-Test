import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int loopCnt = Integer.parseInt(br.readLine());
            String temp = "";
            
            for(int i = 0; i < loopCnt; i++){
                temp += "*";
                bw.write(temp+"\n");
            }
            
            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
