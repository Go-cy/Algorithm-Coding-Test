import java.io.*;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(input[0] == 0) break;
            Arrays.sort(input);
            if(Math.pow(input[0],2) + Math.pow(input[1],2) == Math.pow(input[2],2)) bw.write("right\n");
            else bw.write("wrong\n");
        }
        br.close();
        bw.close();
    }
}
