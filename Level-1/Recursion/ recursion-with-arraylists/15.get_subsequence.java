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

// https://ide.geeksforgeeks.org/online-java-compiler/99933a68-86ca-4d6b-bcb1-961f9e11a4b1
