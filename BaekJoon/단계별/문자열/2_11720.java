import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String trash = br.readLine();
        int[] arr = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.stream(arr).sum() + "\n");
        br.close();
        bw.close();
    }
}
