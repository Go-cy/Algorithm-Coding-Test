import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int loopCount = sc.nextInt();
        
        for(int i = 0; i < loopCount; i++){
            System.out.println(sc.nextInt() + sc.nextInt());
        }
    }
}
