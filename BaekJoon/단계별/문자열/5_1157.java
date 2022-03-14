import java.io.*;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] result = new int[(int)'z' - (int)'a' + 1];
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 'a') result[(int)input.charAt(i)-(int)'a']++;
            else result[(int)input.charAt(i)-(int)'A']++;
        }
        int[] temp = result.clone();
        Arrays.sort(temp);
        if(temp[temp.length-1] == temp[temp.length-2]) bw.write("?");
        else{
            for(int i = 0; i < result.length; i++){
                if(result[i] == temp[temp.length-1]) bw.write((char)i+'A');
            }
        }

        bw.close();
        br.close();
    }
}
