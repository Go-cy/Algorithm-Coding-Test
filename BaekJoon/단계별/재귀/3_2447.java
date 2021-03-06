import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        char[][] arr = new char[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ' ';
            }
        }
        star(arr, 0, 0, length);
        for (char[] chararr : arr) {
            bw.write(String.valueOf(chararr) + "\n");
        }
        bw.flush();
        bw.close();
}

    public static void star(char[][] arr, int x, int y, int N) {
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    star(arr, x + i * (N / 3), y + j * (N / 3), N / 3);
                }
            }
        }
    }
}
