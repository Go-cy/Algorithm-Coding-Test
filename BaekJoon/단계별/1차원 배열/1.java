import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] intArray = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.stream(intArray).min().getAsInt() + " " + Arrays.stream(intArray).max().getAsInt());
        br.close();
        bw.close();
    }
}
