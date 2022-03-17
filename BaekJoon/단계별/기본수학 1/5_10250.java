import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++){
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int XX = (int)Math.ceil((double)input[2]/input[0]);
            int YY = input[2]%input[0] == 0 ? input[0]: input[2]%input[0];
            bw.write(String.valueOf(YY) + (XX < 10 ? "0" : "") + String.valueOf(XX) + "\n");
        }
        br.close();
        bw.close();
    }
}
