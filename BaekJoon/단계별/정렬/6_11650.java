import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[][] input = new int[cnt][2];

        for(int i = 0; i < cnt; i++){
            input[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        br.close();
        
        Arrays.sort(input, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            else{
                return o1[0] - o2[0];
            }
        }));

        for(int[] temp : input)
            bw.write(temp[0] + " " + temp[1] + "\n");
        bw.close();
    }
}
