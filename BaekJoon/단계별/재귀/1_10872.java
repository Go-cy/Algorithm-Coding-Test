import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(pack(Integer.parseInt(br.readLine()))));
        br.close();
        bw.close();
    }

    public static int pack(int input){
        if(input == 0 ) return 1;
        return input * pack(input-1);
    }
}
