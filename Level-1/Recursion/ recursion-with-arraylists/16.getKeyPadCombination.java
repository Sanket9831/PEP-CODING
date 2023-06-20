import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(getKPC(str));
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
                           "yz"
                          };
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>(); //1
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);                        //2
        String ros = str.substring(1);                  //3
        
        ArrayList<String> rres = getKPC(ros);           //4
        ArrayList<String> mres = new ArrayList<>();     //5
        
        String strAtKeyCh = codes[ch-'0'];              //6
        
        for(int i = 0; i <strAtKeyCh.length(); ++i){    //7
            char c = strAtKeyCh.charAt(i);
            for(String s : rres){
                mres.add(c+s);
            }
        }
        return mres;                                    //8
    }
}

// https://ide.geeksforgeeks.org/online-java-compiler/d0513934-6564-416e-973e-45b3752127a7
