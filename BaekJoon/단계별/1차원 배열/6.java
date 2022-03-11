import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        while(cnt-->0){
            String input = br.readLine();
            int result = 0;
            int remains = 0;
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == 'O'){
                    result += 1 + remains++;
                }
                else
                    remains = 0;
            }
            bw.write(result + "\n");
        }

        bw.close();
        br.close();
    }
}
