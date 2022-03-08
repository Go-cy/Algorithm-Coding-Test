import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a>0 && b>0) System.out.println(1);
        if(a<0 && b>0) System.out.println(2);
        if(a<0 && b<0) System.out.println(3);
        if(a>0 && b<0) System.out.println(4);
        
        
	}
}
