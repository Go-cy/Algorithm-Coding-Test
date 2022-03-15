import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(convert(br.readLine())));

        bw.close();
        br.close();
    }

    public static int convert(String input) {
        int result = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            switch (input.charAt(i)) {
                case 'c':
                    if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') i++;
                    break;
                case 'd':
                    if (i < input.length() - 2) {
                        if (input.substring(i+1, i+3).equals("z=")) {
                            i += 2;
                            break;
                        }
                    }
                    if (input.charAt(i + 1) == '-') i++;
                    break;
                case 'l':
                    if (input.charAt(i + 1) == 'j') i++;
                    break;
                case 'n':
                    if (input.charAt(i + 1) == 'j') i++;
                    break;
                case 's':
                    if (input.charAt(i + 1) == '=') i++;
                    break;
                case 'z':
                    if (input.charAt(i + 1) == '=') i++;
                    break;
            }
            result++;
            if (i == input.length() - 1) result--;
        }
        return result+1;
    }
}
