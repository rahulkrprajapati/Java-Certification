package YogeshCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


class Solution{
    Map<Character, ArrayList<Integer>> map;
    Solution(Map<Character, ArrayList<Integer>> map){
        this.map = map;
    }
    public void printSol(){
        System.out.println("Distinct Symbols are:");
        for(char c : this.map.keySet()){
            System.out.print(c + " ");
        }
        System.out.println();
        for(char c : this.map.keySet()){
            ArrayList<Integer> list = this.map.get(c);
            int sum = 0;
            System.out.println("Cards in " + c + " Symbol:");
            for(Integer i : list){
                sum += i;
                System.out.println(c + " " + i);
            }
            System.out.println("Number of Cards: " + list.size());
            System.out.println("Sum of Numbers: " + sum);
        }
    }


}

