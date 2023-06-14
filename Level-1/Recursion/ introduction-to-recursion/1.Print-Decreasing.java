import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n < 1)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }

}

// [URL](https://ide.geeksforgeeks.org/online-java-compiler/18df70f8-53df-4413-9a8d-6d62eacdc255)
