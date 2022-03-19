import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++){
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double distance = Math.sqrt(Math.pow(input[0] - input[3], 2) + Math.pow(input[1] - input[4], 2));
            int result = 0;

            if( distance == 0){
                if(input[2] == input[5]) result = -1;
                else result = 0;
            }
            else if( distance  == input[2] + input[5] || distance == Math.abs(input[2] - input[5]) )
                result = 1;
            else if( distance  > input[2] + input[5] || distance < Math.abs(input[2] - input[5]))
                result = 0;
            else
                result = 2;

            bw.write(result + "\n");
        }
        br.close();
        bw.close();
    }
}
