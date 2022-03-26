import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];

        for(int i = 0; i < cnt; i++)
            arr[i] = Integer.parseInt(br.readLine());

        br.close();
        Arrays.sort(arr);

        for(int i : arr)
            bw.write(String.valueOf(i)+"\n");
        bw.close();
    }
}
