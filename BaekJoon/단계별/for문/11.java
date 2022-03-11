import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] input = br.readLine().split(" ");
            int loopCnt = Integer.parseInt(input[0]);
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            for(int i = 0; i < Integer.parseInt(input[0]); i++){
                if(Integer.parseInt(input[1]) > temp[i])
                    bw.write(temp[i] + " ");
            }

            br.close();
            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
