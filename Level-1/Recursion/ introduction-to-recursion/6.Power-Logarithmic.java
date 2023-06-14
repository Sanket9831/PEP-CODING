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
        if(n==0)return 1;
        int xpnb2 = power(x,n/2);
        int xn = xpnb2*xpnb2;
        if(n%2==1)
            xn *= x;
        return xn;
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/0ee46c65-712b-4885-b1a9-eb0fb11d6f84
