import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        
        for(char i= 'a'; i <= 'z'; i++){
            bw.write(input.indexOf(i) + " ");
        }
        bw.close();
        br.close();
    }
}
