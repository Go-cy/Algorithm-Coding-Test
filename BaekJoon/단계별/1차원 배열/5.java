import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(input);
        bw.write(Double.toString((double)Arrays.stream(input).sum()/input[cnt-1]/input.length*100));
        br.close();
        bw.close();
    }
}
