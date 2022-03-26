import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        br.close();

        Integer[] arr = Arrays.stream(input).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());

        for(int temp : arr)
            bw.write(String.valueOf(temp));
        bw.close();
    }
}
