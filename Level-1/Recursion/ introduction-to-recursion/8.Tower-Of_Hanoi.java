import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        toh(n,n1,n2,n3);
    }
    /*
    Simple logic in TOH is:
        1. Move n-1 Hanoi from source to helper with - help of destination
        2. Move Last nth Hanoi from source to destination
        3. Move back n-1 Hanoi from helper to source - with help of source
        
        these 3 steps needs to be repeated until all Hanoi moved from source to dest
    */
    public static void toh(int n, int source, int dest, int helper){
        if(n==0) return;
        toh(n-1,source,helper,dest);
        System.out.println(n+"["+source+"->"+dest+"]");
        toh(n-1,helper,dest,source);
    }

}
// https://ide.geeksforgeeks.org/online-java-compiler/6573a20e-2225-44a1-82f9-5117c638a0c7
