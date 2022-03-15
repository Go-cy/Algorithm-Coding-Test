import java.util.Scanner;

public class Main {
	
	public static int bkPoint (int fix, int change, int revenue) {
		
		int num = 0;
		
		if( revenue <= change) return -1;
		
		while( fix >= (revenue - change) * num )
		{
			num++;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		String arrValue;
		
		Scanner sc = new Scanner(System.in);
		
		arrValue = sc.nextLine();
		String[] StringArray = new String[3];
		
		StringArray = arrValue.split(" ");
		
		int[] intArray = new int[StringArray.length];
		
		for (int i =0; i < StringArray.length; i++)
		{
			intArray[i] = Integer.parseInt(StringArray[i]);
		}
		
		System.out.println(bkPoint(intArray[0], intArray[1], intArray[2]));
		
	}
}
