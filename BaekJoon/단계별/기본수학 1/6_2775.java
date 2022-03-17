import java.io.*;

public class Main{
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i ++){
            getNum(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
            bw.write(result + "\n");
            result = 0;
        }
        br.close();
        bw.close();
    }
    public static void getNum(int a, int b){
        while(a >= 1) {
            a --;
            while(b >= 1){
                getNum(a,b);
                b--;
            }
        }
        result += b;
    }
}
