import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; ++i)
            arr[i] = sc.nextInt();
        System.out.print(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        return maxOfArrayHelper(arr,max,idx);
    }
    
    public static int maxOfArrayHelper(int[] arr, int[] max, int idx){
        if(idx == arr.length) return Integer.MIN_VALUE;
        max[0] = Math.max(max[0], arr[idx]);
        maxOfArrayHelper(arr,max,idx+1);
        return max[0];
    } 
}

// https://ide.geeksforgeeks.org/online-java-compiler/60b480a1-eac9-4274-b69b-0ebc81876370
