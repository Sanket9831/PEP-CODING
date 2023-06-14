import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }

    public static int factorial(int n){
        if(n==1)return 1;
        return n * factorial(n-1);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/3b74484f-15eb-4f71-8469-1d749665d744
