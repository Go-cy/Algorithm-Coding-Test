import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        for(; input[0] <= input[1]; input[0]++){
            if(sosu(input[0])) bw.write(String.valueOf(input[0]) + "\n");
        }
        bw.close();
    }

    public static boolean sosu(int input){
        if(input == 1) return false;
        else if(input <= 3) return true;
        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input%i == 0) return false;
        }
        return true;
    }
}
