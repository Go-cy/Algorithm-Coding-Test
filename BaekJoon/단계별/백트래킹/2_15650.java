import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        boolean[] use = new boolean[input[0]+1];
        int[] result = new int[input[1]];

        dfs(input[0], input[1], 0, use, result);
    }

    public static void dfs(int n, int m, int deep, boolean[] use, int[] result){
        if(m == deep){
            for(int i = 0; i < result.length; i++){
                System.out.print(result[i] + (i != result.length -1 ? " " : "\n"));
            }
            return;
        }

        for(int i = 1; i <= n; i++){
            if(use[i]) continue;
            if(deep > 0)
                if(i <= result[deep-1])
                    continue;
            result[deep] = i;
            use[i] = true;
            dfs(n, m, deep+1, use, result);
            use[i] = false;
        }
    }
}
