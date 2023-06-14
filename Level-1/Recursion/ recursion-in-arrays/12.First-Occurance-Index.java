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
        int x = sc.nextInt();
        System.out.print(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        //first check index under bound then if value at index is = x
        if(idx < arr.length && arr[idx] == x) 
            return idx;
        //in case index just got out of bound, then x is not present return -1
        if(idx == arr.length)
            return -1;
        return firstIndex(arr,idx+1,x);
    }

}
//https://ide.geeksforgeeks.org/online-java-compiler/b654e78e-fb35-4f3e-bd7f-738d57bf7eee
