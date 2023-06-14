import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n < 1)  return;
        printIncreasing(n-1);
        System.out.println(n);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/7dbff918-640c-4294-b69c-4b0e059dae61
