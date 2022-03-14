import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(hansu(Integer.parseInt(br.readLine())) + "\n");

        br.close();
        bw.close();
    }

    public static int hansu(int input){
        if(input < 100) return input;
        else if(input == 1000) input--;
        int cnt = 99;
        while(input >= 100){
            if((input/100)%10 - (input/10)%10 == (input/10)%10 - input%10){
                cnt++;
            }
            input--;
        }
        return cnt;
    }
}
