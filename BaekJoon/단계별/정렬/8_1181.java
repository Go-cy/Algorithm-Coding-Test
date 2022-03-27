import java.io.*;
import java.util.*;
import java.util.stream.Stream;

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

        Arrays.sort(input, ((o1, o2) -> {
            if(o1.length() == o2.length()){
                for(int i = 0; i < o1.length(); i++){
                    if(o1.charAt(i) != o2.charAt(i))
                        return o1.charAt(i) - o2.charAt(i);
                }
                return 0;
            }
            else{
                return o1.length() - o2.length();
            }
        }));

        for(int i = 0; i < input.length; i++){
            if(i == 0 || (i > 0 && !input[i].equals(input[i-1])))
                bw.write(input[i] + "\n");
        }
        bw.close();
    }
}
