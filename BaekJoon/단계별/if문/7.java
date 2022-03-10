import java.util.*;

public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Integer[] intArray = new Integer[] {a,b,c};
        Arrays.sort(intArray,Collections.reverseOrder());
        int result;
        if(intArray[0] == intArray[2]){
            result = 10000 + intArray[0] * 1000;
        }
        else if(intArray[0] == intArray[1] || intArray[1] == intArray[2]){
            result = 1000 + intArray[1] * 100;
        }
        else {
            result = intArray[0] * 100;
        }
        System.out.println(result);
    }
}
