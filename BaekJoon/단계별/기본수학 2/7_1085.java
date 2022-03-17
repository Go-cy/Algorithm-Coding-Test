import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        int[] result = new int[4];

        result[0] = input[0];
        result[1] = input[1];
        result[2] = input[2]-input[0];
        result[3] = input[3]-input[1];

        Arrays.sort(result);
        bw.write(String.valueOf(result[0]));
        bw.close();
    }
}
