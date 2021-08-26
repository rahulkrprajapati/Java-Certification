package PandaClasses;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;
import java.util.*;
public class MCQSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add(null);
        set.add("One");
        for(String s: set){
            System.out.println(s);
        }
    }
}
