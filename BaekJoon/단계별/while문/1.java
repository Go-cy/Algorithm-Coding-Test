import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] temp = new int[2];
        
        while(true){
            temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(temp[0] == 0 && temp[1] == 0) break;
            bw.write(temp[0]+temp[1]+"\n");
        }
        
        br.close();
        bw.close();
        }
        catch(IOException e){
            
        }
    }
}
