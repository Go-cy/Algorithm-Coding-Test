import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(b-45 >= 0) b -= 45;
        else {
            if(a == 0) a = 23;
            else a--;
            
            b += 15;
            
        }
        System.out.println(Integer.toString(a)+ " " + Integer.toString(b));
        
        
	}
}
