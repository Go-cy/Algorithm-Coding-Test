import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++){
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "push" :
                    stack.push(Integer.parseInt(str[1]));
                    break;
                case "pop" :
                    if(stack.size() > 0) System.out.println(stack.pop());
                    else System.out.println("-1");
                    break;
                case "top" :
                    if(stack.size() > 0) System.out.println(stack.peek());
                    else System.out.println("-1");
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case  "empty" :
                    System.out.println(stack.empty() == true ? 1 : 0);
                    break;
            }
        }
        br.close();
    }
}
