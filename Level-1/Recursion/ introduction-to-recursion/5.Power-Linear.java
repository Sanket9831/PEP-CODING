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
        if(x < 1) return 1;
        return n * power(x-1,n);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/807e245e-c677-43c4-9599-479c4dccc246
