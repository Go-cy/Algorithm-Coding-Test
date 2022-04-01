import java.io.*;

public class Main{
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        br.close();
        arr = new int[N];

        nQueen(0);
        bw.write(String.valueOf(count));
        bw.close();
    }

    public static void nQueen(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (Possibility(depth))
                nQueen(depth + 1);
        }

    }

    public static boolean Possibility(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }

            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i]))
                return false;
        }

        return true;
    }
}
