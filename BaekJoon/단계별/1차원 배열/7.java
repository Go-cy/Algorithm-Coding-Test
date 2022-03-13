import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < loopCnt; i++){
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            double avr = (double)(Arrays.stream(input).sum() - input[0])/(input.length - 1);
            int over = 0;
            for(int j = 1; j < input.length; j++){
                if(input[j] > avr) over++;
            }
            double per = (double)over/(input.length-1)*100;
            bw.write(String.format("%.3f", per) + "%\n");

        }
        
        bw.close();
        br.close();
    }
}
