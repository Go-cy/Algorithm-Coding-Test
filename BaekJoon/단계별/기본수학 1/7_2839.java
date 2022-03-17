import java.io.*;

public class Main{
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        br.close();
        int result = 0;
        while(true){
            if(input%5 ==0){
                result += input/5;
                break;
            }
            else{
                result++;
                input -= 3;
            }
            if(input < 0) {
                result = -1;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
