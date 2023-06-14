import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.print(power(x,n));
    }

    public static int power(int x, int n){
        if(n < 1) return 1;
        return x * power(x,n-1);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/0c6e9868-e73e-4301-95a4-2f8f2f5356c8
