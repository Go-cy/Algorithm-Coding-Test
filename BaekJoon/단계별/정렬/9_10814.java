import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] input = new String[cnt];

        for(int i = 0; i < cnt; i++){
            input[i] = br.readLine();
        }
        br.close();

        Arrays.sort(input, (o1, o2) -> {
            return Integer.parseInt(o1.split(" ")[0]) - Integer.parseInt(o2.split(" ")[0]);
        });

        for (String temp : input)
            bw.write(temp + "\n");
        bw.close();
    }
}
