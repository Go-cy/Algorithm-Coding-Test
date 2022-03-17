import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        int result = 0;
        for(int i = 0; i < input.length; i++){
            result += sosu(input[i]);
        }

        bw.write(String.valueOf(result));
        bw.close();
    }

    public static int sosu(int input){
        if(input == 1) return 0;
        else if(input <= 3) return 1;
        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input%i == 0) return 0;
        }
        return 1;
    }
}
