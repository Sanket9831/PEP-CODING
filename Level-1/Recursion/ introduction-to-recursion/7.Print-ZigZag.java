import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0) return;
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/a2922e26-4dbc-438a-af5a-430633b0ee55
