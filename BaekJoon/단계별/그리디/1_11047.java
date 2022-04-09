import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        Integer[] input = new Integer[N];
        int maxIndex = 0;

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int i = 0; i < input.length; i++){
            if(input[i] <= K){
                maxIndex = i;
            }
            else break;
        }

        //배수 조건 없는 경우
        ArrayList<Integer> result = new ArrayList<>();
        while(maxIndex >= 0) {
            int cnt = 0;
            int tempIndex = maxIndex;
            int value = K;
            while (value > 0) {
                int temp = value / input[tempIndex];
                value -= temp * input[tempIndex];
                cnt += temp;
                tempIndex--;
            }
            result.add(cnt);
            maxIndex--;
        }

        Collections.sort(result);

        bw.write(String.valueOf(result.get(0)));

        //배수조건 있는 경우
//        int cnt = 0;
//        while (K > 0) {
//            int temp = K / input[maxIndex];
//            K -= temp * input[maxIndex];
//            cnt += temp;
//            maxIndex--;
//        }
//        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
