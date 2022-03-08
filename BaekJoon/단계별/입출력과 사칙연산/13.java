import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        int result1 = A*(B%10);
        int result2 = A*((B/10)%10);
        int result3 = A*(B/100);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result1 + result2 * 10 + result3 * 100);
        
	}
}
