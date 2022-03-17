import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++){
            bw.write(goldbarh(Integer.parseInt(br.readLine())) + "\n");
        }
        br.close();
        bw.close();
    }

    public static String goldbarh(int input){
        for(int i=input/2; i >= 2; i--){
            if(sosu(i) && sosu(input-i))
                return i + " " + (input-i);
        }
        return "";
    }

    public static boolean sosu(int input){
        if(input == 1) return false;
        else if(input <= 3) return true;
        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input%i == 0) return false;
        }
        return true;
    }
}
