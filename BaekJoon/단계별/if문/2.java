import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int A;
        A = sc.nextInt();
        char result;
        
        if(A>=90) result = 'A';
        else if (A >= 80) result = 'B';
        else if (A >= 70) result = 'C';
        else if (A >= 60) result = 'D';
        else result = 'F';
        System.out.println(result);
	}
}
