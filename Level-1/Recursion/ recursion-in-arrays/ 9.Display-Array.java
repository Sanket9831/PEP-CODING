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
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }
}
// https://ide.geeksforgeeks.org/online-java-compiler/6ce66a1c-abd4-4004-9fc5-37d7c7b981d2
