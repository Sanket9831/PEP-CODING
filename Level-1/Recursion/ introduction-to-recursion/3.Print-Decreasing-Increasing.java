import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n<1) return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/22c0bca6-c99f-4920-8fbb-3c3bcd2da72d
