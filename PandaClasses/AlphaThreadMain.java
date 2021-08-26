package PandaClasses;

import java.util.*;
//import jdk.nashorn.internal.parser.Scanner;
public class AlphaThreadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nt = sc.nextInt();
        int it = sc.nextInt();
  
        for(int i = 1; i <= nt; i++) {
            Thread t = new Thread(new AlphaThread(nt,it,i));
            t.start();
        }  
    }
}
