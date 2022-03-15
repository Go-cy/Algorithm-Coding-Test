import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(input == 1) bw.write("1/1");
        else {
            while (input > 0) {
                cnt++;
                input -= cnt;
            }
            int mom = cnt + input;
            int son = -input + 1;
            if(cnt%2 == 0){
                int temp = mom;
                mom = son;
                son = temp;
            }
            bw.write(son + "/" + mom);
        }
        br.close();
        bw.close();
    }
}
