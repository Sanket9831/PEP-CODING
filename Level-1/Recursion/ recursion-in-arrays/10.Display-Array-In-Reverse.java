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
        displayArr(arr,n-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx < 0) return;
        System.out.println(arr[idx]);
        displayArr(arr,idx-1);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/31c3710f-74ec-480a-be06-6cbe6ecd755c
