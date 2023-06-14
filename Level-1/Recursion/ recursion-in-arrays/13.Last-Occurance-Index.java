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
        System.out.print(lastIndex(arr,n-1,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        //first check index under bound then if value at index is = x
        if(idx > 0 && arr[idx] == x) 
            return idx;
        //in case index just got out of bound to -1 index, then x is not present return -1
        if(idx < 0)
            return -1;
        return lastIndex(arr,idx-1,x);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/f31266c3-5fb0-45a4-866f-2499438051a2
