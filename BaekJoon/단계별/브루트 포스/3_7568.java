import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int[][] arr = new int[input][2];
        for(int i = 0; i < input; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            int rank = 1;
            for(int j = 0; j < arr.length; j++){
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            sb.append(rank + " ");
        }

        System.out.println(sb);
    }
}
