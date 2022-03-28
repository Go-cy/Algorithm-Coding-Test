import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String trash = br.readLine();
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        int[] sortArr = input.clone();
        Arrays.sort(sortArr);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int cnt = -1;
        for(int i = 0; i < sortArr.length; i++){
            if(!hashMap.containsKey(sortArr[i]))
                hashMap.put(sortArr[i],++cnt);
        }

        for(int i = 0; i < input.length; i++){
            bw.write(String.valueOf(hashMap.get(input[i])) + (i != input.length-1 ? " " : ""));
        }

        bw.close();
    }
}
