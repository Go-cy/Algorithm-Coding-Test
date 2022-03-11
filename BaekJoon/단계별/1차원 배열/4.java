import java.util.HashMap;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 1; i <= 10; i ++)
            hashMap.put(Integer.valueOf(br.readLine())%42,0);

        bw.write(hashMap.size() + "\n");

        br.close();
        bw.close();
    }
}
