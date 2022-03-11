import java.util.stream.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] temp;
            String str;
            
            while((str = br.readLine()) != null){
                temp = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
                bw.write(temp[0]+temp[1]+"\n");
            }
            
            br.close();
            bw.close();
        }
        catch(IOException e){
            
        }
    }
}
