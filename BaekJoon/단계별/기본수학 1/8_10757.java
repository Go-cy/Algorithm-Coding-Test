import java.io.*;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Main{
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        br.close();

        BigInteger input0 = new BigInteger(input[0]);
        BigInteger input1 = new BigInteger(input[1]);

        bw.write(String.valueOf(input0.add(input1)));
        bw.close();
    }
}
