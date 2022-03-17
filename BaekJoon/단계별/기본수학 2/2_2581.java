import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;
        int min = 0;
        for(int i = start; i <= end; i++){
            result += sosu(i);
            if(min == 0 && result > 0) min = i;
        }

        if(result > 0) bw.write(String.valueOf(result) + "\n" + String.valueOf(min));
        else bw.write("-1");
        bw.close();
    }

    public static int sosu(int input){
        if(input == 1) return 0;
        else if(input <= 3) return input;
        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input%i == 0) return 0;
        }
        return input;
    }
}
