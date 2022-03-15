import java.io.*;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < cnt; i++){
            result += groupWord(br.readLine());
        }
        br.close();
        bw.write(String.valueOf(result));
        bw.close();
    }

    public static int groupWord(String input){
        boolean[] add = new boolean[(int)'z' - (int)'a' + 1];
        char lastAdd = 0;
        for(int j = 0; j < input.length(); j++){
            if(add[(int)input.charAt(j) - (int)'a'] == false){
                add[(int)input.charAt(j) - (int)'a'] = true;
                lastAdd = input.charAt(j);
            }
            else{
                if(input.charAt(j) == lastAdd){
                    continue;
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
