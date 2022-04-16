package FixedWindow;

import java.util.*;

public class UserMainCode {
        public int largestSubarray(int input1, int input2, String input3){

            int starting_num = input2;
            boolean flag = true;
            int distinct = input2;
            while(flag){
                ArrayList<String> combiStrings = new ArrayList<>();
                for (int i = 0; i < input3.length(); i++) {
                    // System.out.println(combiStrings);
                    if(i+starting_num<input3.length())
                        combiStrings.add(input3.substring(i, i+starting_num));
                }
                TreeMap<Character,Integer> count = new TreeMap<>();
                
                for (String string : combiStrings) {
                    if(flag==false)
                        break;
                    else
                    for(int i=0; i<string.length();i++){
                        if(count.containsKey(string.charAt(i))==false){
                            count.put(string.charAt(i), 1);
                        }
                        else{
                            if(count.get(string.charAt(i))>distinct){
                                flag = false;
                                break;
                            }
                            else{
                                count.put(string.charAt(i), count.get(string.charAt(i))+1);
                            }
                        }
                    }
                }
                starting_num+=1;

            }
            return starting_num;
        }

        
    public static void main(String[] args) {
        System.out.println(new UserMainCode().largestSubarray(9, 2 , "baaabbcca"));
    }
}
