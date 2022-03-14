import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < input[1].length(); j++)
                for(int k = 0; k < Integer.parseInt(input[0]); k++)
                    bw.write(input[1].charAt(j));
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
