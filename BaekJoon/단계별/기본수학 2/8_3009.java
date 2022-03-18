import java.io.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] point1 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] point2 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] point3 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        int[] point4 = new int[2];
        if(point1[0] == point2[0]) point4[0] = point3[0];
        else if(point1[0] == point3[0]) point4[0] = point2[0];
        else point4[0] = point1[0];

        if(point1[1] == point2[1]) point4[1] = point3[1];
        else if(point1[1] == point3[1]) point4[1] = point2[1];
        else point4[1] = point1[1];

        bw.write(point4[0] + " " + point4[1]);
        bw.close();
    }
}
