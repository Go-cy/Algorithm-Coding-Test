import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input == 0) break;
            int cnt = 0;
            for(int i = input+1; i <= input*2; i++){
                if(sosu(i)) cnt++;
            }
            bw.write(String.valueOf(cnt) + "\n");
        }
        br.close();
        bw.close();
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
