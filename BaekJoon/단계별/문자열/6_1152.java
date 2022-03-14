import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().trim().split(" ");
        int length = input.length;
        if(input[0].equals("") || input[input.length-1].equals("")) length--;
        bw.write(Integer.toString(length));
        bw.close();
        br.close();
    }
}
