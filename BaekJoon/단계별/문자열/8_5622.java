import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int result = 0;
        for(char temp : input.toCharArray()) result += getNum(temp);
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }

    public static int getNum(char input){
        int result = 0;
        if(input >= 'W') result = 10;
        else if(input >= 'T') result = 9;
        else if(input >= 'P') result = 8;
        else if(input >= 'M') result = 7;
        else if(input >= 'J') result = 6;
        else if(input >= 'G') result = 5;
        else if(input >= 'D') result = 4;
        else if(input >= 'A') result = 3;
        return result;
    }
}
