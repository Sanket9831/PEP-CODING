import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; 
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = gss(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        for(String res : rres){
            mres.add("" + res);
            mres.add(ch + res);
        }
        
        return mres;
    }
}

// https://ide.geeksforgeeks.org/online-java-compiler/b61a92ee-8a3e-4d62-8603-52d03f6d9a65
