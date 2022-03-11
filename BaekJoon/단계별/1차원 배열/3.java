import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input1 = Integer.parseInt(br.readLine());
        int input2 = Integer.parseInt(br.readLine());
        int input3 = Integer.parseInt(br.readLine());
        String result = Integer.toString(input1 * input2 * input3);

        int cnt;
        for(int i = 0; i <= 9; i++){
            cnt = 0;
            for(int j = 0; j < result.length(); j++){
                if(result.charAt(j) - '0' == i)
                    cnt++;
            }
            bw.write(cnt + "\n");
        }
        br.close();
        bw.close();
    }
}
