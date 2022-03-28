import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        boolean[] use = new boolean[input[0]+1];
        int[] result = new int[input[1]];
        StringBuilder sb = new StringBuilder();

        dfs(input[0], input[1], 0, result, sb);
        bw.write(sb.toString());
        bw.close();
    }

    public static void dfs(int n, int m, int deep, int[] result, StringBuilder sb){
        if(m == deep){
            for(int i = 0; i < result.length; i++){
                sb.append(result[i] + (i != result.length -1 ? " " : "\n"));
            }
            return;
        }

        for(int i = 1; i <= n; i++){
            result[deep] = i;
            dfs(n, m, deep+1, result, sb);
        }
    }
}
