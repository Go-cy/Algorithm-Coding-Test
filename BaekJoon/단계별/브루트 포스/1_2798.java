import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        int result = 0;

        for(int i = 0; i < arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k <arr.length; k++){
                    int temp = arr[i]+arr[j]+arr[k];
                    if(temp <= input[1] && result < temp){
                        result = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
