import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int loopCnt = Integer.parseInt(br.readLine());
            char[] temp = new char[loopCnt];
            
            for(int i = 0; i < temp.length; i++){
                temp[i] = ' ';
            }

            for(int i = 0; i < loopCnt; i++){
                temp[loopCnt-1-i] = '*';
                bw.write(String.valueOf(temp)+"\n");
            }
            
            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
