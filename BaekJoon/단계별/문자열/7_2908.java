import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(ReverseInt(input[0]) > ReverseInt(input[1]) ? ReverseInt(input[0]) : ReverseInt(input[1])));

        bw.close();
        br.close();

    }

    public static int ReverseInt(int input){
        int result = 0;
        while(input != 0){
            result = result*10 + input%10;
            input /= 10;
        }
        return result;
    }
}
