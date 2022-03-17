import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        br.close();

        int mod = 2;
        while(input > 1){
            if(input == mod) {
                bw.write(String.valueOf(input));
                break;
            }
            else if(input%mod == 0) {
                bw.write(String.valueOf(mod)+"\n");
                input /= mod;
            }
            else mod++;
        }
        bw.close();
    }
}
