import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(fibo(Integer.parseInt(br.readLine()))));
        br.close();
        bw.close();
    }

    public static int fibo(int input){
        if(input <=1) return input;
        return fibo(input-1) + fibo(input-2);
    }
}
