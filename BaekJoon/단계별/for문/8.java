import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int loopCnt = Integer.parseInt(br.readLine());

            String[] strSplit;

            for(int i = 1; i <= loopCnt; i++){
                strSplit = br.readLine().split(" ");
                bw.write(String.format("Case #%d: %d + %d = %d\n", i, Integer.parseInt(strSplit[0]), Integer.parseInt(strSplit[1]), Integer.parseInt(strSplit[0])+Integer.parseInt(strSplit[1])));
            }
            
            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
