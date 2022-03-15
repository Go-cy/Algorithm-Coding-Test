import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int cnt = 1;
        while(input > 1){
            input -= 6*(cnt);
            cnt++;
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}
