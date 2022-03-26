import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];

        for(int i = 0; i < cnt; i++)
            arr[i] = Integer.parseInt(br.readLine());

        br.close();
        Arrays.sort(arr);

        bw.write(String.valueOf(Math.round((double)Arrays.stream(arr).sum()/arr.length)) + "\n");
        bw.write(String.valueOf(arr[arr.length/2]) + "\n");

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hashMap.containsKey(arr[i]))
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            else
                hashMap.put(arr[i],1);
        }

        int maxValue = Collections.max(hashMap.values());
        int maxcnt = 0;
        List<Integer> maxList = new ArrayList<>();

        for(Integer temp : hashMap.keySet()){
            if(hashMap.get(temp) == maxValue){
                maxcnt++;
                maxList.add(temp);
            }
        }
        if(maxcnt > 1){
            Collections.sort(maxList);
            bw.write(String.valueOf(maxList.get(1)) + "\n");
        }
        else{
            bw.write(String.valueOf(maxList.get(0)) + "\n");
        }

        bw.write(String.valueOf(arr[arr.length-1] - arr[0]) + "\n");
        bw.close();
    }
}
