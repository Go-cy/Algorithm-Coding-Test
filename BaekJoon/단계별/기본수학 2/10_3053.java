import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.format("%.6f", (Math.pow(input,2) * Math.PI)) + "\n");
        bw.write(String.format("%.6f", (Math.pow(input,2) * 2)));

        bw.close();
    }
}
